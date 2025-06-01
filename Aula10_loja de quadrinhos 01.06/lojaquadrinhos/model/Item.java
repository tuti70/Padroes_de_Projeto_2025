package lojaquadrinhos.model;

public class Item {
    private TipoItem tipo;
    private double valor;

    public Item(TipoItem tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public TipoItem getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return tipo.name() + " - R$ " + String.format("%.2f", valor);
    }
}