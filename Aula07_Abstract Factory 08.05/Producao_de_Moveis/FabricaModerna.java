class FabricaModerna implements FabricaMoveis {
    @Override
    public Cadeira criarCadeira() {
        return new CadeiraModerna();
    }

    @Override
    public Mesa criarMesa() {
        return new MesaModerna();
    }

    @Override
    public Sofa criarSofa() {
        return new SofaModerno();
    }
}