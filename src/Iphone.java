public class Iphone {
  int volume;
  int bateria;
  int brilho;
  boolean bloqueado;

  void ligar() {
    System.out.println("Ligando...");
  }
  void desligar() {
    System.out.println("Desligando...");
  }
  void carregarBateria() {
    System.out.println("Carregando...");
  }
  void verificarBateria() {
    System.out.println("Bateria: " + bateria);
  }
  void desbloquear() {
    System.out.println("Desbloqueando...");
  }
}