
public interface Observer {
    void update(Filme filme);

    void ativarNotificacoes();

    void desativarNotificacoes();

    boolean isNotificacoesAtivas();
}