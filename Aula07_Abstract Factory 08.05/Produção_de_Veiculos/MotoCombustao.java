class MotoCombustao implements Moto {
    @Override
    public void acelerar() {
        System.out.println("Moto a combustão acelerando com ronco do escapamento");
    }

    @Override
    public void frear() {
        System.out.println("Moto a combustão freando com disco dianteiro");
    }
}