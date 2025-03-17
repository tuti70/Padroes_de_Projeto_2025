public class SOLID {
//__________________________________________________________________________________________________________________________
    // 1. Single Responsibility Principle (SRP)


    // Classe que viola o SRP - Problema: A classe Pedido tem múltiplas
    // responsabilidades: calcular o total do pedido, salvar o pedido no banco de
    // dados e enviar um email de confirmação. Isso viola o SRP, que diz que uma
    // classe deve ter apenas uma razão para mudar.
    class Pedido {
        public void calcularTotal() {
            // Lógica para calcular o total do pedido
            System.out.println("Calculando o total do pedido...");
        }

        public void salvarPedido() {
            // Lógica para salvar o pedido no banco de dados
            System.out.println("Salvando o pedido no banco de dados...");
        }

        public void enviarEmailConfirmacao() {
            // Lógica para enviar email de confirmação
            System.out.println("Enviando email de confirmação...");
        }
    }

    // Classe que segue o SRP - Melhoria: Agora, cada classe tem uma única
    // responsabilidade. Pedido cuida apenas do cálculo do total, PedidoRepository
    // cuida da persistência e EmailService cuida do envio de emails.
    class Pedido {
        public void calcularTotal() {
            // Lógica para calcular o total do pedido
            System.out.println("Calculando o total do pedido...");
        }
    }

    class PedidoRepository {
        public void salvarPedido() {
            // Lógica para salvar o pedido no banco de dados
            System.out.println("Salvando o pedido no banco de dados...");
        }
    }

    class EmailService {
        public void enviarEmailConfirmacao() {
            // Lógica para enviar email de confirmação
            System.out.println("Enviando email de confirmação...");
        }
    }

//__________________________________________________________________________________________________________________________
    // 2. Open/Closed Principle (OCP)
x

    // Classe que viola o OCP - Problema: A classe Relatorio viola o OCP porque,
    // para adicionar um novo tipo de relatório, precisamos modificar o código
    // existente.
    class Relatorio {
        public void gerarRelatorio(String tipo) {
            if (tipo.equals("PDF")) {
                System.out.println("Gerando relatório em PDF...");
            } else if (tipo.equals("Excel")) {
                System.out.println("Gerando relatório em Excel...");
            }
            // Se precisarmos adicionar um novo tipo de relatório, precisaremos modificar
            // esta classe
        }
    }

    // Classe que segue o OCP - Melhoria: Agora, a classe Relatorio está aberta para
    // extensão (podemos adicionar novos tipos de relatório) mas fechada para
    // modificação (não precisamos alterar o código existente).

    interface Relatorio {
        void gerar();
    }

    class RelatorioPDF implements Relatorio {
        @Override
        public void gerar() {
            System.out.println("Gerando relatório em PDF...");
        }
    }

    class RelatorioExcel implements Relatorio {
        @Override
        public void gerar() {
            System.out.println("Gerando relatório em Excel...");
        }
    }

    class RelatorioWord implements Relatorio {
        @Override
        public void gerar() {
            System.out.println("Gerando relatório em Word...");
        }
    }

//__________________________________________________________________________________________________________________________
    // 3. Liskov Substitution Principle (LSP)


    // Classe que viola o LSP - Problema: A classe Quadrado viola o LSP porque
    // altera o comportamento esperado da classe Retangulo. Um Quadrado não pode
    // substituir um Retangulo sem alterar o comportamento esperado.
    class Retangulo {
        protected int largura;
        protected int altura;

        public void setLargura(int largura) {
            this.largura = largura;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }

        public int calcularArea() {
            return largura * altura;
        }
    }

    class Quadrado extends Retangulo {
        @Override
        public void setLargura(int largura) {
            this.largura = largura;
            this.altura = largura;
        }

        @Override
        public void setAltura(int altura) {
            this.altura = altura;
            this.largura = altura;
        }
    }

    // Classe que segue o LSP - Melhoria: Agora, Quadrado e Retangulo são classes
    // separadas que implementam a interface Forma. Isso garante que ambas possam
    // ser substituídas sem alterar o comportamento esperado.
    interface Forma {
        int calcularArea();
    }

    class Retangulo implements Forma {
        protected int largura;
        protected int altura;

        public void setLargura(int largura) {
            this.largura = largura;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }

        @Override
        public int calcularArea() {
            return largura * altura;
        }
    }

    class Quadrado implements Forma {
        private int lado;

        public void setLado(int lado) {
            this.lado = lado;
        }

        @Override
        public int calcularArea() {
            return lado * lado;
        }
    }
//__________________________________________________________________________________________________________________________
    // 4. Interface Segregation Principle (ISP)


    // Classe que viola o ISP - Problema: A interface Trabalhador viola o ISP porque
    // força a classe Robo a implementar métodos que não são relevantes para ela
    // (comer e descansar).
    interface Trabalhador {
        void trabalhar();

        void comer();

        void descansar();
    }

    class Humano implements Trabalhador {
        @Override
        public void trabalhar() {
            System.out.println("Humano trabalhando...");
        }

        @Override
        public void comer() {
            System.out.println("Humano comendo...");
        }

        @Override
        public void descansar() {
            System.out.println("Humano descansando...");
        }
    }

    class Robo implements Trabalhador {
        @Override
        public void trabalhar() {
            System.out.println("Robo trabalhando...");
        }

        @Override
        public void comer() {
            // Robo não come, mas é forçado a implementar este método
            throw new UnsupportedOperationException("Robo não come");
        }

        @Override
        public void descansar() {
            // Robo não descansa, mas é forçado a implementar este método
            throw new UnsupportedOperationException("Robo não descansa");
        }
    }

    // Classe que segue o ISP - Melhoria: Agora, as interfaces são segregadas de
    // acordo com as responsabilidades. Robo implementa apenas a interface
    // Trabalhador, enquanto Humano implementa todas as interfaces relevantes.
    interface Trabalhador {
        void trabalhar();
    }

    interface Comedor {
        void comer();
    }

    interface Descansador {
        void descansar();
    }

    class Humano implements Trabalhador, Comedor, Descansador {
        @Override
        public void trabalhar() {
            System.out.println("Humano trabalhando...");
        }

        @Override
        public void comer() {
            System.out.println("Humano comendo...");
        }

        @Override
        public void descansar() {
            System.out.println("Humano descansando...");
        }
    }

    class Robo implements Trabalhador {
        @Override
        public void trabalhar() {
            System.out.println("Robo trabalhando...");
        }
    }
//__________________________________________________________________________________________________________________________
    // 5. Dependency Inversion Principle (DIP)


    // Classe que viola o DIP - Problema: A classe Interruptor viola o DIP porque
    // depende diretamente de uma classe concreta (Lampada), em vez de depender de
    // uma abstração.
    class Lampada {
        public void ligar() {
            System.out.println("Lampada ligada");
        }

        public void desligar() {
            System.out.println("Lampada desligada");
        }
    }

    class Interruptor {
        private Lampada lampada;

        public Interruptor(Lampada lampada) {
            this.lampada = lampada;
        }

    public void acionar() {
        if (/* condição */) {
            lampada.ligar();
        } else {
            lampada.desligar();
        }
    }
    }

    // Classe que segue o DIP - Melhoria: Agora, Interruptor depende de uma
    // abstração (Dispositivo), o que permite que ele funcione com qualquer
    // dispositivo que implemente essa interface, não apenas com Lampada.
    interface Dispositivo {
        void ligar();

        void desligar();
    }

    class Lampada implements Dispositivo {
        @Override
        public void ligar() {
            System.out.println("Lampada ligada");
        }

        @Override
        public void desligar() {
            System.out.println("Lampada desligada");
        }
    }

    class Interruptor {
        private Dispositivo dispositivo;

        public Interruptor(Dispositivo dispositivo) {
            this.dispositivo = dispositivo;
        }

    public void acionar() {
        if (/* condição */) {
            dispositivo.ligar();
        } else {
            dispositivo.desligar();
        }
    }
    }

}
