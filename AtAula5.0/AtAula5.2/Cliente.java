public class Cliente {
    public static void main(String[] args) {

        FabricaDeCaminhoes fabricaMercedes = new FabricaMercedes();
        CaminhaoSimples cargo = fabricaMercedes.criarCaminhaoSimples();
        CaminhaoLuxo actros = fabricaMercedes.criarCaminhaoLuxo();

        cargo.exibirCaminhaoSimples();
        actros.exibirCaminhaoLuxo();


        FabricaDeCaminhoes fabricaVolvo = new FabricaVolvo();
        CaminhaoSimples fh = fabricaVolvo.criarCaminhaoSimples();
        CaminhaoLuxo xmx = fabricaVolvo.criarCaminhaoLuxo();

        fh.exibirCaminhaoSimples();
        xmx.exibirCaminhaoLuxo();



    }
}