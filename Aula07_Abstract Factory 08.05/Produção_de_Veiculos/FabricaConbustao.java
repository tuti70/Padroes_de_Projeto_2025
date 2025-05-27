class FabricaCombustao implements FabricaVeiculos {
    @Override
    public Carro criarCarro() {
        return new CarroCombustao();
    }

    @Override
    public Moto criarMoto() {
        return new MotoCombustao();
    }

    @Override
    public Caminhao criarCaminhao() {
        return new CaminhaoCombustao();
    }
}