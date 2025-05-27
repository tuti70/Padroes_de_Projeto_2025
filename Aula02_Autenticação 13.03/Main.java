// Classe principal com o método main
public class Main {
    public static void main(String[] args) {
        Secretario secretario = new Secretario();
        secretario.calcSalario();

        Engenheiro engenheiro = new Engenheiro();
        engenheiro.calcSalario();
        engenheiro.comissao();

        Diretor diretor = new Diretor();
        diretor.calcSalario();
        diretor.Login();

        Gerente gerente = new Gerente();
        gerente.calcSalario();
        gerente.Login();

        Cliente cliente = new Cliente("João", 25, "M", "Rua 1", "123456789");
        cliente.Login();
    }
}