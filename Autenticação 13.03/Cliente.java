public class Cliente extends Pessoa implements Autenticavel, Departamento {
    @Override
    public void atualizar() {
        // Implementação do atualizar para Cliente
        System.out.println("Cliente atualizou.");
    }

    @Override
    public void cadastrar() {
        // Implementação do cadastrar para Cliente
        System.out.println("Cliente cadastrou.");
    }
    public Cliente(String nome, int idade, String sexo, String endereco, String telefone) {
            super(nome, idade, sexo, endereco, telefone);
        }
    
        @Override
    public void Login() {
        // Implementação do login para Cliente
        System.out.println("Cliente fez login.");
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