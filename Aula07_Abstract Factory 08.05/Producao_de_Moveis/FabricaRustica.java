class FabricaRustica implements FabricaMoveis {
    @Override
    public Cadeira criarCadeira() {
        return new CadeiraRustica();
    }

    @Override
    public Mesa criarMesa() {
        return new MesaRustica();
    }

    @Override
    public Sofa criarSofa() {
        return new SofaRustico();
    }
}