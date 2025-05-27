class MesaIndustrial implements Mesa {
    @Override
    public void montar() {
        System.out.println("Montando mesa industrial com dobradiças expostas");
    }

    @Override
    public void estilo() {
        System.out.println("Mesa no estilo industrial: concreto e aço com superfície rústica");
    }
}