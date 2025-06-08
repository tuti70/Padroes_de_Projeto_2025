public class Pacote4 extends PacoteDecorator {
    public Pacote4(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() + " | Pacote 4: Cartão de crédito Platinum";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 49.99;
    }
}