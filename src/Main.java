import AparelhoTelefonico.Aparelho;
import Iphone.iPhone;

public class Main {
    public static void main(String[] args)
    {


         iPhone a = new iPhone("Iphone 1");
         a.ligar();
         a.atender();
         a.adicionarNovaAba();
         a.tocar();
         a.pausar();
         a.selecionarMusica();
         a.iniciarCorreioVoz();
         a.exibirPagina();
         a.atualizarPagina();



    }
}