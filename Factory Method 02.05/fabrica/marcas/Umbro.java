public class Umbro extends FabricaEsportiva {
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaFluminense();
    }
}