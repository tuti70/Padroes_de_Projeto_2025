import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FabricaViolao fabrica = new FabricaViolao();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tipos de violões disponíveis:");
        System.out.println("1 - Clássico");
        System.out.println("2 - Folk");
        System.out.println("3 - Flet");
        System.out.println("4 - Jumbo");
        System.out.println("5 - 7 Cordas");
        System.out.println("6 - 12 Cordas");
        System.out.println("7 - Zero");
        System.out.println("8 - Duplo Zero");
        System.out.println("9 - Triplo Zero");
        System.out.print("Escolha um tipo (1-9): ");

        int escolha = scanner.nextInt();
        String tipo = "";

        switch (escolha) {
            case 1:
                tipo = "classico";
                break;
            case 2:
                tipo = "folk";
                break;
            case 3:
                tipo = "flet";
                break;
            case 4:
                tipo = "jumbo";
                break;
            case 5:
                tipo = "7cordas";
                break;
            case 6:
                tipo = "12cordas";
                break;
            case 7:
                tipo = "zero";
                break;
            case 8:
                tipo = "duplozero";
                break;
            case 9:
                tipo = "triplozero";
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close();
                return;
        }

        Violao violao = fabrica.criarViolao(tipo);
        if (violao != null) {
            System.out.println("\nDetalhes do violão criado:");
            System.out.println(violao);
        } else {
            System.out.println("Tipo de violão não encontrado.");
        }

        scanner.close();
    }
}