class FabricaMercedes implements FabricaDeCaminhoes {
    @Override
    public CaminhaoSimples criarCaminhaoSimples() {
        return new Fh();
    }

    @Override
    public CaminhaoLuxo criarCaminhaoLuxo() {
        return new Xmx();
    }
}