import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginSystem loginSystem = LoginSystem.getInstance();
        
        boolean loggedIn = false;
        
        while (!loggedIn) {
            System.out.println("\n=== Sistema de Login ===");
            
            System.out.print("Usuário: ");
            String username = scanner.nextLine();
            
            System.out.print("Senha: ");
            String password = scanner.nextLine();
            
            System.out.println("Digite o seguinte código para verificação: " + loginSystem.getCaptcha());
            System.out.print("Código de verificação: ");
            String captcha = scanner.nextLine();
            
            loggedIn = loginSystem.login(username, password, captcha);
            
            if (loggedIn) {
                System.out.println("\nLogin bem-sucedido! Acesso concedido.");
            } else {
                System.out.println("\nFalha no login. Verifique suas credenciais ou o código de verificação.");
                System.out.println("Tente novamente...\n");
            }
        }
        
        scanner.close();
    }
}