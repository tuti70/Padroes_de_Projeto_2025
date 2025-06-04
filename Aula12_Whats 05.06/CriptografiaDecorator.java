
public class CriptografiaDecorator extends NotificacaoDecorator {
    public CriptografiaDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String enviar(String mensagem) {
        String mensagemCriptografada = criptografar(mensagem);
        return super.enviar(mensagemCriptografada);
    }

    private String criptografar(String mensagem) {
        // Simulação simples de criptografia
        return "[CRIPTOGRAFADO] " + mensagem + " [CRIPTOGRAFADO]";
    }
}