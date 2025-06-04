public class EmailDecorator extends NotificacaoDecorator {
    public EmailDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String enviar(String mensagem) {
        return super.enviar(mensagem) + " + Email enviado";
    }
}