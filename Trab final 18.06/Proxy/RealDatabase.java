package Proxy;

// 2. Classe real (RealSubject)
class RealDatabase implements Database {
    @Override
    public void query(String sql) {
        System.out.println("[RealDatabase] Executando query: " + sql);
    }
}