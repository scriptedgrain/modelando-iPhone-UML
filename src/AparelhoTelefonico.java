import java.util.List;
import java.util.Map;

public class AparelhoTelefonico {
    Map<String, String> contatos;
    List<String> historicoDeChamadas;
    boolean statusLigacao;
    boolean chamadaEmEspera;

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }
    public void atender() {
        System.out.println("Atendendo...");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
    public void listarContatos() {
        System.out.println("Listando contatos...");
    }
    public void verHistoricoDeChamadas() {
        System.out.println("Verificando histórico de chamadas...");
    }
    public void colocarEmEspera() {
        System.out.println("Colocando em espera...");
    }
    public void retomarChamada() {
        System.out.println("Retomando chamada...");
    }
    public void finalizarChamada() {
        System.out.println("Finalizando chamada...");
    }    
}
