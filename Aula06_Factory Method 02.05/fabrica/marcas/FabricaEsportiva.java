public abstract class FabricaEsportiva {
    public abstract CamisaEsportiva criarCamisa();

    public void produzirCamisa() {
        CamisaEsportiva camisa = criarCamisa();
        System.out.println("--- Informações da Camisa ---");
        camisa.exibirTime();
        camisa.exibirFabrica();
        System.out.println("----------------------------");
    }
}