public class Pacote1 extends PacoteDecorator {
    public Pacote1(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() + " | Pacote 1: Assistir vídeos em vários dispositivos";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 19.99;
    }
}