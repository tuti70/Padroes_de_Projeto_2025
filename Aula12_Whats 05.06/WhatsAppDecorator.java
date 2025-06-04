
public class WhatsAppDecorator extends NotificacaoDecorator {
    public WhatsAppDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String enviar(String mensagem) {
        return super.enviar(mensagem) + " + WhatsApp enviado";
    }
}