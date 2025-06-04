
public abstract class NotificacaoDecorator implements Notificacao {
    protected Notificacao notificacao;

    public NotificacaoDecorator(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    @Override
    public String enviar(String mensagem) {
        return notificacao.enviar(mensagem);
    }
}