class FabricaIndustrial implements FabricaMoveis {
    @Override
    public Cadeira criarCadeira() {
        return new CadeiraIndustrial();
    }

    @Override
    public Mesa criarMesa() {
        return new MesaIndustrial();
    }

    @Override
    public Sofa criarSofa() {
        return new SofaIndustrial();
    }
}