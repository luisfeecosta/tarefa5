class FabricaMercedes implements FabricaDeCaminhoes {
    @Override
    public CaminhaoSimples criarCaminhaoSimples() {
        return new Cargo();
    }

    @Override
    public CaminhaoLuxo criarCaminhaoLuxo() {
        return new Actros();
    }
}