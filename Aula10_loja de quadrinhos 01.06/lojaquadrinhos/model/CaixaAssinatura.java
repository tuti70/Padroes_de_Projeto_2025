package lojaquadrinhos.model;

import java.util.ArrayList;
import java.util.List;

public class CaixaAssinatura {
    private Cliente cliente;
    private List<Item> itens;

    public CaixaAssinatura(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        if (itens.size() < cliente.getLimiteItens()) {
            itens.add(item);
        }
    }

    public double calcularValorTotal() {
        return itens.stream().mapToDouble(Item::getValor).sum();
    }

    public List<Item> getItens() {
        return new ArrayList<>(itens);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Caixa de Assinatura - ").append(cliente.getNivel()).append("\n");
        sb.append("Cliente: ").append(cliente.getNome()).append("\n");
        sb.append("Itens (").append(itens.size()).append("/").append(cliente.getLimiteItens()).append("):\n");

        for (Item item : itens) {
            sb.append("- ").append(item.toString()).append("\n");
        }

        sb.append("Valor Total: R$ ").append(String.format("%.2f", calcularValorTotal()));
        return sb.toString();
    }
}