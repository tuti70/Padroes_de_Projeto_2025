
import java.util.List;
import java.util.ArrayList;

public class Usuario implements Observer {
    private String nome;
    private List<String> generosPreferidos;
    private boolean notificacoesAtivas;

    public Usuario(String nome, List<String> generosPreferidos) {
        this.nome = nome;
        this.generosPreferidos = new ArrayList<>(generosPreferidos);
        this.notificacoesAtivas = true;
    }

    public String getNome() {
        return nome;
    }

    public List<String> getGenerosPreferidos() {
        return new ArrayList<>(generosPreferidos);
    }

    @Override
    public void update(Filme filme) {
        if (notificacoesAtivas) {
            System.out.println("Notificação para " + nome + ": Novo filme do gênero " +
                    filme.getGenero() + " - " + filme.getTitulo());
        }
    }

    @Override
    public void ativarNotificacoes() {
        this.notificacoesAtivas = true;
        System.out.println(nome + ": Notificações ativadas");
    }

    @Override
    public void desativarNotificacoes() {
        this.notificacoesAtivas = false;
        System.out.println(nome + ": Notificações desativadas");
    }

    @Override
    public boolean isNotificacoesAtivas() {
        return notificacoesAtivas;
    }
}