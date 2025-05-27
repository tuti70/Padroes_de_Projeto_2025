class CadeiraIndustrial implements Cadeira {
    @Override
    public void montar() {
        System.out.println("Montando cadeira industrial com parafusos aparentes");
    }

    @Override
    public void estilo() {
        System.out.println("Cadeira no estilo industrial: metal e madeira com acabamento bruto");
    }
}