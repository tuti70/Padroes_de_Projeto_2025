package lojaquadrinhos;

import lojaquadrinhos.model.Cliente;
import lojaquadrinhos.service.CaixaService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CaixaService caixaService = new CaixaService();

        System.out.println("Bem-vindo à Loja de Quadrinhos!");
        System.out.println("---------------------------------");

        // Solicitar nome do cliente
        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();

        // Mostrar opções de nível
        System.out.println("\nEscolha seu nível de assinatura:");
        System.out.println("1 - Bronze (3 itens)");
        System.out.println("2 - Prata (5 itens)");
        System.out.println("3 - Ouro (7 itens)");
        System.out.println("4 - Platina (10 itens)");
        System.out.print("Digite o número da opção desejada: ");

        int opcao = 0;
        String nivel = "";

        // Validar a entrada do usuário
        while (true) {
            try {
                opcao = Integer.parseInt(scanner.nextLine());
                if (opcao < 1 || opcao > 4) {
                    System.out.print("Opção inválida. Por favor, digite um número entre 1 e 4: ");
                    continue;
                }

                switch (opcao) {
                    case 1:
                        nivel = "BRONZE";
                        break;
                    case 2:
                        nivel = "PRATA";
                        break;
                    case 3:
                        nivel = "OURO";
                        break;
                    case 4:
                        nivel = "PLATINA";
                        break;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Por favor, digite um número entre 1 e 4: ");
            }
        }

        // Criar o cliente
        Cliente cliente = new Cliente(nome, nivel);

        // Gerar e mostrar a caixa
        System.out.println("\nProcessando sua caixa " + nivel + "...");
        System.out.println("---------------------------------");
        System.out.println(caixaService.gerarCaixaAssinatura(cliente));

        scanner.close();
    }
}