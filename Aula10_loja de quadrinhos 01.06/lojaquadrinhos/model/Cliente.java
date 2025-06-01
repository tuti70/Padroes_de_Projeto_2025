package lojaquadrinhos.model;

public class Cliente {
    private String nome;
    private String nivel;

    public Cliente(String nome, String nivel) {
        this.nome = nome;
        this.nivel = nivel.toUpperCase();
    }

    public String getNome() {
        return nome;
    }

    public String getNivel() {
        return nivel;
    }

    public int getLimiteItens() {
        switch (nivel) {
            case "BRONZE":
                return 3;
            case "PRATA":
                return 5;
            case "OURO":
                return 7;
            case "PLATINA":
                return 10;
            default:
                return 0;
        }
    }
}