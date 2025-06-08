public class Pacote5 extends PacoteDecorator {
    public Pacote5(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() + " | Pacote 5: Compra com Cash Back";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 19.99;
    }
}