public class ReprodutorMusical extends Iphone {
    int tempoMusica;
    String album;
    String musicaAtual;
    public boolean estadoReproducao;
  
    public void tocar() {
        System.out.println("Tocando...");
    }
    public void pausar() {
        System.out.println("Pausando...");
    }
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música...");
    }
    public void classificarMusica() {
        System.out.println("Classificando música...");
    }
    public void musicaAnterior() {
        System.out.println("Música anterior...");
    }
    public void proximaMusica() {
        System.out.println("Próxima música...");
    }
    public void mostrarDetalhesMusica() {
        System.out.println("Detalhes da música...");
    }
}
