package Proxy;

//Proxy (controla acesso ao RealDatabase)
class DatabaseProxy implements Database {
    private RealDatabase realDatabase;
    private boolean isAdmin;

    public DatabaseProxy(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public void query(String sql) throws Exception {
        if (!isAdmin && sql.trim().toUpperCase().startsWith("DELETE")) { // Verifica se é uma operação de deleção
            throw new Exception("Acesso negado: apenas admins podem deletar dados!");
        }

        if (realDatabase == null) {
            realDatabase = new RealDatabase(); // Lazy initialization
        }

        System.out.println("[Proxy] Verificando permissões...");
        realDatabase.query(sql);
    }
}