import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nDigite a mensagem (ou 0 para sair):");
            String mensagem = scanner.nextLine();
            if (mensagem.equals("0")) {
                System.out.println("Saindo...");
                break;
            }

            System.out.println("Escolha os canais de notificação (separe por vírgula, ou 0 para sair):");
            System.out.println("1 - Email");
            System.out.println("2 - SMS");
            System.out.println("3 - WhatsApp");
            System.out.println("4 - Slack");
            System.out.println("5 - Criptografar mensagem");
            String canais = scanner.nextLine();
            if (canais.trim().equals("0")) {
                System.out.println("Saindo...");
                break;
            }
            String[] opcoes = canais.split(",");

            Notificacao notificacao = new NotificacaoSimples();

            for (String opcao : opcoes) {
                switch (opcao.trim()) {
                    case "1":
                        notificacao = new EmailDecorator(notificacao);
                        break;
                    case "2":
                        notificacao = new SMSDecorator(notificacao);
                        break;
                    case "3":
                        notificacao = new WhatsAppDecorator(notificacao);
                        break;
                    case "4":
                        notificacao = new SlackDecorator(notificacao);
                        break;
                    case "5":
                        notificacao = new CriptografiaDecorator(notificacao);
                        break;
                    default:
                        System.out.println("Opção inválida: " + opcao);
                }
            }

            System.out.println("Mensagem enviada:");
            System.out.println(notificacao.enviar(mensagem));
        }

        scanner.close();
    }
}