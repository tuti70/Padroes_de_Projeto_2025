
public class Diretor extends Funcionario implements Autenticavel, Fornecedor, Departamento  {
    @Override
    public void Login() {
        // Implementação do login para Diretor
        System.out.println("Diretor fez login.");
    }
    @Override
    public void Pedido() {
        // Implementação do pedido para Diretor
        System.out.println("Pedido realizado pelo Diretor.");
    }
    @Override
    public void criarDepartamento() {
        // Implementação do criarDepartamento para Cliente
        System.out.println("Cliente criou departamento.");
    }
    @Override
    public void cadastrarFuncionario() {
        // Implementação do cadastrarFuncionario para Cliente
        System.out.println("Cliente cadastrou funcionário.");
    }
}