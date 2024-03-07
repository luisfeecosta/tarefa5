public class Cliente {
    public static void main(String[] args) {
    
        FabricaDeMotos fabricaYamaha = new FabricaYamaha();
        MotoEsportiva yamahaR1 = fabricaYamaha.criarMotoEsportiva();
        MotoCustom yamahaBolt = fabricaYamaha.criarMotoCustom();

        yamahaR1.exibirMotoEsportiva();
        yamahaBolt.exibirMotoCustom();

      
        FabricaDeMotos fabricaDucati = new FabricaDucati();
        MotoEsportiva ducatiPanigale = fabricaDucati.criarMotoEsportiva();
        MotoCustom ducatiDiavel = fabricaDucati.criarMotoCustom();
        ducatiPanigale.exibirMotoEsportiva();
        ducatiDiavel.exibirMotoCustom();

        FabricaDeMotos fabricaHonda = new fabricaHonda();
        MotoEsportiva hondaCbr = fabricaHonda.criarMotoEsportiva();
        MotoCustom hondaShadow = fabricaHonda.criarMotoCustom();


        hondaCbr.exibirMotoEsportiva();
        hondaShadow.exibirMotoCustom();
    }
}