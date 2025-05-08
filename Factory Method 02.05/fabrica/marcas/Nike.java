public class Nike extends FabricaEsportiva {
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaBrasil();
    }
}