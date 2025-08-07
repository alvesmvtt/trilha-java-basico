package iphone;

import aplicativos.Music;
import aplicativos.Navegador;
import aplicativos.Telefone;

public class DesafioIphone {

    public static void main(String[] args) {
       Music music = new Music();
       music.tocar();
       music.pausar();
       music.selecionarMusica();
       
       Telefone telefone = new Telefone();
       
       telefone.atender();
       telefone.ligar();
       telefone.iniciarCorreidoVoz();
       
       Navegador navegador = new Navegador();
       
       navegador.adicionarNovaAba();
       navegador.atualizarPagina();
       navegador.exibirPagina();
       
       
    }
}
