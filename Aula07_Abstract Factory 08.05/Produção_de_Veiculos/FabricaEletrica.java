class FabricaEletrica implements FabricaVeiculos {
    @Override
    public Carro criarCarro() {
        return new CarroEletrico();
    }

    @Override
    public Moto criarMoto() {
        return new MotoEletrica();
    }

    @Override
    public Caminhao criarCaminhao() {
        return new CaminhaoEletrico();
    }
}