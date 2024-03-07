
class FabricaDucati implements FabricaDeMotos {
    @Override
    public MotoEsportiva criarMotoEsportiva() {
        return new Panigale();
    }

    @Override
    public MotoCustom criarMotoCustom() {
        return new Diavel();
    }
}
