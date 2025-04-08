package view;
import dao.UserDAO;
import controller.UserController;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File testFile = new File("users.dat");
        System.out.println("Caminho absoluto: " + testFile.getAbsolutePath());
        System.out.println("Pode escrever? " + testFile.canWrite());
        UserController controller = new UserController();
        UserDAO userDAO = new UserDAO(); // Initialize UserDAO
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSistema de Gerenciamento de Usuários");
            System.out.println("1. Adicionar Usuário");
            System.out.println("2. Buscar Usuário");
            System.out.println("3. Atualizar Usuário");
            System.out.println("4. Remover Usuário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                String input = scanner.nextLine(); // Ler como String primeiro
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                        System.out.print("Nome: ");
                        String name = scanner.nextLine();
                        System.out.print("Email: ");
                        String email = scanner.nextLine();
                        System.out.println(controller.addUser(name, email));
                        break;
                    case 2:
                        System.out.print("ID do Usuário: ");
                        String idInput = scanner.nextLine();
                        int id = Integer.parseInt(idInput);
                        System.out.println(controller.getUser(id));
                        break;
                    case 3:
                        System.out.print("ID do Usuário: ");
                        String updateIdInput = scanner.nextLine();
                        int updateId = Integer.parseInt(updateIdInput);
                        System.out.print("Novo Nome: ");
                        String newName = scanner.nextLine();
                        System.out.print("Novo Email: ");
                        String newEmail = scanner.nextLine();
                        System.out.println(controller.updateUser(updateId, newName, newEmail));
                        break;
                    case 4:
                        System.out.print("ID do Usuário: ");
                        String deleteIdInput = scanner.nextLine();
                        int deleteId = Integer.parseInt(deleteIdInput);
                        System.out.println(controller.deleteUser(deleteId));
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        scanner.close();
                        System.exit(0);

                    case 6: // Adicione esta opção
                        userDAO.printAllUsers();
                        break;
                    
                        default:
                        System.out.println("Opção inválida!");

                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido!");
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
            }
        }
    }
}