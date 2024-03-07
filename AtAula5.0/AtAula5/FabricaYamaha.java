class FabricaYamaha implements FabricaDeMotos {
    @Override
    public MotoEsportiva criarMotoEsportiva() {
        return new R1();
    }

    @Override
    public MotoCustom criarMotoCustom() {
        return new Bolt();
    }
}
