public class MainCarros {
    public static void main(String[] args) {
        // Criando fábrica de veículos elétricos
        FabricaVeiculos fabricaEletrica = new FabricaEletrica();
        Carro carroEletrico = fabricaEletrica.criarCarro();
        Moto motoEletrica = fabricaEletrica.criarMoto();
        Caminhao caminhaoEletrico = fabricaEletrica.criarCaminhao();

        System.out.println("Veículos Elétricos:");
        carroEletrico.acelerar();
        motoEletrica.acelerar();
        caminhaoEletrico.acelerar();
        caminhaoEletrico.carregar();

        // Criando fábrica de veículos a combustão
        FabricaVeiculos fabricaCombustao = new FabricaCombustao();
        Carro carroCombustao = fabricaCombustao.criarCarro();
        Moto motoCombustao = fabricaCombustao.criarMoto();
        Caminhao caminhaoCombustao = fabricaCombustao.criarCaminhao();

        System.out.println("\nVeículos a Combustão:");
        carroCombustao.acelerar();
        motoCombustao.acelerar();
        caminhaoCombustao.acelerar();
        caminhaoCombustao.carregar();
    }
}