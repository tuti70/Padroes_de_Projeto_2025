public class Kappa extends FabricaEsportiva {
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaVasco();
    }
}