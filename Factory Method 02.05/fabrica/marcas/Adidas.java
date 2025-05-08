public class Adidas extends FabricaEsportiva {
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaFlamengo();
    }
}