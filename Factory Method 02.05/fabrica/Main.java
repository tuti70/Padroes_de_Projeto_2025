import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma fábrica para ver a camisa do time:");
        System.out.println("1 - Nike");
        System.out.println("2 - Adidas");
        System.out.println("3 - Puma");
        System.out.println("4 - Umbro");
        System.out.println("5 - Kappa");
        System.out.print("Opção: ");

        int opcao = scanner.nextInt();
        FabricaEsportiva fabrica = null;

        switch (opcao) {
            case 1:
                fabrica = new Nike();
                break;
            case 2:
                fabrica = new Adidas();
                break;
            case 3:
                fabrica = new Puma();
                break;
            case 4:
                fabrica = new Umbro();
                break;
            case 5:
                fabrica = new Kappa();
                break;
            default:
                System.out.println("Opção inválida!");
                System.exit(0);
        }

        fabrica.produzirCamisa();
        scanner.close();
    }
}