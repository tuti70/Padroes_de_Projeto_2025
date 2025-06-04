
public class SlackDecorator extends NotificacaoDecorator {
    public SlackDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String enviar(String mensagem) {
        return super.enviar(mensagem) + " + Slack notificado";
    }
}