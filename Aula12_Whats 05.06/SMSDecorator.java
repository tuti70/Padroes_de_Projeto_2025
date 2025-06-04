
public class SMSDecorator extends NotificacaoDecorator {
    public SMSDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String enviar(String mensagem) {
        return super.enviar(mensagem) + " + SMS enviado";
    }
}