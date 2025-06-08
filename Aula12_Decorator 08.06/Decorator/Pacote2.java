public class Pacote2 extends PacoteDecorator {
    public Pacote2(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() + " | Pacote 2: Frete Grátis em produtos";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 9.99;
    }
}