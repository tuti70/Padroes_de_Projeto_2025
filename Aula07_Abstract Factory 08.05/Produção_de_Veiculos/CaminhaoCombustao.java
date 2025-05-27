class CaminhaoCombustao implements Caminhao {
    @Override
    public void acelerar() {
        System.out.println("Caminhão a diesel acelerando com fumaça");
    }

    @Override
    public void frear() {
        System.out.println("Caminhão a diesel freando com sistema a ar");
    }

    @Override
    public void carregar() {
        System.out.println("Caminhão a diesel abastecendo tanque");
    }
}