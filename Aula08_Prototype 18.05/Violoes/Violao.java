public abstract class Violao implements Cloneable {
    protected String modelo;
    protected String tipoCorda;
    protected String descricao;
    protected boolean eletrico;

    public Violao clone() {
        try {
            return (Violao) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + "\n" +
                "Tipo de Corda: " + tipoCorda + "\n" +
                "Elétrico: " + (eletrico ? "Sim" : "Não") + "\n" +
                "Descrição: " + descricao + "\n";
    }
}