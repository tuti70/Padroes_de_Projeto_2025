class CadeiraRustica implements Cadeira {
    @Override
    public void montar() {
        System.out.println("Montando cadeira rústica com encaixes de madeira");
    }

    @Override
    public void estilo() {
        System.out.println("Cadeira no estilo rústico: madeira aparente e acabamento envelhecido");
    }
}