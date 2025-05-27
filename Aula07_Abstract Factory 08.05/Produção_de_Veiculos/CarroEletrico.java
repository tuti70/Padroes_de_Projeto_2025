class CarroEletrico implements Carro {
    @Override
    public void acelerar() {
        System.out.println("Carro elétrico acelerando silenciosamente");
    }

    @Override
    public void frear() {
        System.out.println("Carro elétrico freando com regeneração de energia");
    }
}