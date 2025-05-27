public class MainMoveis {
    public static void main(String[] args) {
        // Criando fábrica de móveis modernos
        FabricaMoveis fabricaModerna = new FabricaModerna();
        Cadeira cadeiraModerna = fabricaModerna.criarCadeira();
        Mesa mesaModerna = fabricaModerna.criarMesa();
        Sofa sofaModerno = fabricaModerna.criarSofa();

        System.out.println("Móveis Modernos:");
        cadeiraModerna.montar();
        mesaModerna.estilo();
        sofaModerno.conforto();

        // Criando fábrica de móveis rústicos
        FabricaMoveis fabricaRustica = new FabricaRustica();
        Cadeira cadeiraRustica = fabricaRustica.criarCadeira();
        Mesa mesaRustica = fabricaRustica.criarMesa();
        Sofa sofaRustico = fabricaRustica.criarSofa();

        System.out.println("\nMóveis Rústicos:");
        cadeiraRustica.montar();
        mesaRustica.estilo();
        sofaRustico.conforto();

        // Criando nova fábrica de móveis industriais
        FabricaMoveis fabricaIndustrial = new FabricaIndustrial();
        Cadeira cadeiraIndustrial = fabricaIndustrial.criarCadeira();
        Mesa mesaIndustrial = fabricaIndustrial.criarMesa();
        Sofa sofaIndustrial = fabricaIndustrial.criarSofa();

        System.out.println("\nMóveis Industriais:");
        cadeiraIndustrial.estilo();
        mesaIndustrial.montar();
        sofaIndustrial.conforto();
    }
}