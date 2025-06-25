
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        Validator validatorChain = client.createValidationChain();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Validação de Login/Senha ===");
        System.out.println("Logins válidos para teste: admin, user, guest");
        System.out.println("Digite 'sair' para encerrar\n");

        while (true) {
            System.out.print("Digite o login: ");
            String login = scanner.nextLine();

            if (login.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite a senha: ");
            String password = scanner.nextLine();

            System.out.println("\n=== Resultado da Validação ===");
            if (validatorChain.validate(login, password)) {
                System.out.println("Login e senha válidos! Acesso concedido.");
            } else {
                System.out.println("Acesso negado. Corrija os problemas indicados.");
            }
            System.out.println("=============================\n");
        }

        System.out.println("Sistema encerrado.");
        scanner.close();
    }
}