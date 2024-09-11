package Iphone;


import AparelhoTelefonico.Aparelho;
import NavegadorNaInternet.Navegar;
import ReprodutorMusical.Musica;

public class iPhone implements Aparelho, Navegar, Musica {
    private String iPhone;
    public iPhone(String iPhone) {
        this.iPhone = iPhone;
    }

    @Override
    public void tocar() {
System.out.println("TOCAR");
    }

    @Override
    public void pausar() {
System.out.println("pausar");
    }

    @Override
    public void selecionarMusica() {
    System.out.println("Selecionando musica");
    }

    @Override
    public void exibirPagina() {
    System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
    System.out.println("Adicionando novo aba");
    }

    @Override
    public void atualizarPagina() {
    System.out.println("Atualizando pagina");
    }

    @Override
    public void ligar() {
    System.out.println("Ligando");
    }

    @Override
    public void atender() {
    System.out.println("Atender");
    }

    @Override
    public void iniciarCorreioVoz() {
    System.out.println("Iniciando Correio Voz");
    }
}
