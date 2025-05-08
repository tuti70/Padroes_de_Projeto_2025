public class Puma extends FabricaEsportiva {
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaBotafogo();
    }
}