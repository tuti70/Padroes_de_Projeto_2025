
public class Filme {
    private String titulo;
    private String genero;

    public Filme(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return titulo + " (" + genero + ")";
    }
}