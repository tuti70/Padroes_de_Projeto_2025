class MotoEletrica implements Moto {
    @Override
    public void acelerar() {
        System.out.println("Moto elétrica acelerando instantaneamente");
    }

    @Override
    public void frear() {
        System.out.println("Moto elétrica freando suavemente");
    }
}