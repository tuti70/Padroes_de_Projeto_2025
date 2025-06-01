package lojaquadrinhos.service;

import lojaquadrinhos.model.*;
import java.util.Map;
import java.util.Random;

public class CaixaService {
    private Map<TipoItem, Double> precos;
    private Random random;

    public CaixaService() {
        this.random = new Random();
        this.precos = Map.of(
                TipoItem.QUADRINHO, 15.0,
                TipoItem.CHAVEIRO, 5.0,
                TipoItem.BUSTO, 10.0,
                TipoItem.ADESIVO, 1.0,
                TipoItem.POSTER, 25.0,
                TipoItem.CAMISETA, 25.0,
                TipoItem.CANETA, 3.0,
                TipoItem.MINIATURA, 20.0);
    }

    public CaixaAssinatura gerarCaixaAssinatura(Cliente cliente) {
        CaixaAssinatura caixa = new CaixaAssinatura(cliente);
        int limite = cliente.getLimiteItens();

        while (caixa.getItens().size() < limite) {
            caixa.adicionarItem(gerarItemAleatorio());
        }

        return caixa;
    }

    private Item gerarItemAleatorio() {
        TipoItem[] tipos = TipoItem.values();
        TipoItem tipo = tipos[random.nextInt(tipos.length)];
        double valor = precos.get(tipo);
        return new Item(tipo, valor);
    }
}