// Classe Engenheiro
public class Engenheiro extends Funcionario implements Fornecedor {
    @Override
    public void Pedido() {
        // Implementação do pedido para Diretor
        System.out.println("Pedido realizado pelo Engenheiro.");
    }
}