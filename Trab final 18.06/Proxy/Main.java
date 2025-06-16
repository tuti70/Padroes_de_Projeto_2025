package Proxy;

public class Main {
    public static void main(String[] args) {
        // Cria um proxy para admin (tem permissão)
        Database admin = new DatabaseProxy(true);

        // Cria um proxy para usuário comum (sem permissão)
        Database user = new DatabaseProxy(false);

        try {
            System.out.println("--- Admin ---");
            admin.query("SELECT * FROM users");
            admin.query("DELETE FROM users WHERE id = 1");

            System.out.println("\n--- Usuário ---");
            user.query("SELECT * FROM products");
            user.query("DELETE FROM users");
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}