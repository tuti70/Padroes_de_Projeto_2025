import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> pacotesSelecionados = new HashSet<>();

        System.out.println("Bem-vindo ao serviço de streaming!");
        System.out.println("Você deseja contratar a assinatura base? (S/N)");
        String resposta = scanner.nextLine();

        if (!resposta.equalsIgnoreCase("S")) {
            System.out.println("Obrigado por visitar nosso serviço!");
            scanner.close();
            return;
        }

        Assinatura assinatura = new AssinaturaBase();

        while (true) {
            System.out.println("\nPacotes disponíveis:");
            System.out.println("1 - Assistir vídeos em vários dispositivos - R$19,99");
            System.out.println("2 - Frete Grátis em produtos - R$9,99");
            System.out.println("3 - Caixa surpresa com produtos - R$29,99");
            System.out.println("4 - Cartão de crédito Platinum - R$49,99");
            System.out.println("5 - Compra com Cash Back - R$19,99");
            System.out.println("0 - Finalizar contratação");

            System.out.print("\nEscolha um pacote (1-5) ou 0 para finalizar: ");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                break;
            }

            if (opcao < 1 || opcao > 5) {
                System.out.println("Opção inválida!");
                continue;
            }

            if (pacotesSelecionados.contains(opcao)) {
                System.out.println("Pacote já selecionado!");
                continue;
            }

            switch (opcao) {
                case 1:
                    assinatura = new Pacote1(assinatura);
                    break;
                case 2:
                    assinatura = new Pacote2(assinatura);
                    break;
                case 3:
                    assinatura = new Pacote3(assinatura);
                    break;
                case 4:
                    assinatura = new Pacote4(assinatura);
                    break;
                case 5:
                    assinatura = new Pacote5(assinatura);
                    break;
            }

            pacotesSelecionados.add(opcao);
            System.out.println("Pacote adicionado com sucesso!");
        }

        System.out.println("\nResumo da sua assinatura:");
        System.out.println(assinatura.getDescricao());
        System.out.printf("Preço total: R$%.2f%n", assinatura.getPreco());
        System.out.println("\nObrigado por assinar nosso serviço!");

        scanner.close();
    }
}