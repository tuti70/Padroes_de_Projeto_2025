class CaminhaoEletrico implements Caminhao {
    @Override
    public void acelerar() {
        System.out.println("Caminhão elétrico acelerando com torque máximo");
    }

    @Override
    public void frear() {
        System.out.println("Caminhão elétrico freando com sistema regenerativo");
    }

    @Override
    public void carregar() {
        System.out.println("Caminhão elétrico carregando baterias");
    }
}