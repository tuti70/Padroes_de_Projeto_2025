class CarroCombustao implements Carro {
    @Override
    public void acelerar() {
        System.out.println("Carro a combustão acelerando com barulho do motor");
    }

    @Override
    public void frear() {
        System.out.println("Carro a combustão freando com desgaste de pastilhas");
    }
}