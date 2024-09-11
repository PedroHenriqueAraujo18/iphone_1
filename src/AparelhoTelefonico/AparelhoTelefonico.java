package AparelhoTelefonico;

public class AparelhoTelefonico implements Aparelho{


    @Override
    public void tocar() {
        System.out.println("TOCAR");
    }


    @Override
    public void pausar() {
        System.out.print("PAUSAR");
    }

    @Override
    public void selecionarMusica() {
        System.out.print("SELECIONAR MUSICA");
    }
}
