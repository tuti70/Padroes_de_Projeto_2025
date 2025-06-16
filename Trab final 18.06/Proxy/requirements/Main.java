package Proxy.requirements;

//Interface comum (Subject)
interface Database {
    void query(String sql) throws Exception;
}

// Classe real (RealSubject)
class RealDatabase implements Database {
    @Override
    public void query(String sql) {
        System.out.println("[RealDatabase] Executando query: " + sql);
    }
}

// Proxy (controla acesso ao RealDatabase)
class DatabaseProxy implements Database {
    private RealDatabase realDatabase;
    private boolean isAdmin;

    public DatabaseProxy(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public void query(String sql) throws Exception {
        if (!isAdmin && sql.trim().toUpperCase().startsWith("DELETE")) {
            throw new Exception("Acesso negado: apenas admins podem deletar dados!");
        }

        if (realDatabase == null) {
            realDatabase = new RealDatabase(); // Lazy initialization
        }

        System.out.println("[Proxy] Verificando permissões...");
        realDatabase.query(sql);
    }
}

public class Main {
    public static void main(String[] args) {
        // Cria um proxy para admin (tem permissão)
        Database admin = new DatabaseProxy(true);

        // Cria um proxy para usuário comum (sem permissão)
        Database user = new DatabaseProxy(false);

        try {
            System.out.println("--- Admin ---");
            admin.query("SELECT * FROM users"); // OK
            admin.query("DELETE FROM users WHERE id = 1"); // OK

            System.out.println("\n--- Usuário ---");
            user.query("SELECT * FROM products"); // OK
            user.query("DELETE FROM users"); // Lança exceção
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}