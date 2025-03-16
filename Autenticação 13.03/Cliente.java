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
        azer uma implementação em uma linguagem Orientada JAva a Objetos para cada princípio de programação SOLID (SRP, OCP, LSP, ISP e DIP ). a implementação inicialmente deve apresentar o código em desacordo com o princípio. Você deve mostrar o que está ferindo o princípio, explicando por meio de comentários no código e depois deve apresentar o código corrigido e que esteja de acordo com o princípio. O código incorreto deve ser colocado numa classe e o código correto em outra classe. 

        E deve ser feito um relatório explicando o que faz cada código implementado e seu respectivo princípio. A explicação deve conter o porquê uma classe "errada" viola o princípio e oo porquê a "classe certa" não viola o princípio.
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