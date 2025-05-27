// Classe Gerente
public class Gerente extends Funcionario implements Autenticavel, Fornecedor {
    @Override
    public void Login() {
        // Implementação do login para Gerente
        System.out.println("Gerente fez login.");
    }
    @Override
    public void Pedido() {
        // Implementação do pedido para Diretor
        System.out.println("Pedido realizado pelo Gerente.");
    }
}