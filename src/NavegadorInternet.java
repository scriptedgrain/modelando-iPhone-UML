import java.util.List;

public class NavegadorInternet {
    List<String> abasAbertas;  
    List<String> historico;
    String paginaAtual;
    boolean modoIncognito;

    public void exibirPagina(String url) {
        System.out.println("Exibindo página...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    public void fecharAba(int indice) {
        System.out.println("Fechando aba " + indice + "...");
    }

    public void navegarPara(String url) {
        System.out.println("Navegando para " + url + "...");
    }

    public void adicionarFavorito(String url) {
        System.out.println("Adicionando favorito: " + url);
    }

    public void removerFavorito(String url) {
        System.out.println("Removendo favorito: " + url);
    }

    public void exibirFavoritos() {
        System.out.println("Exibindo favoritos...");
    }

    public void buscar(String termo) {
        System.out.println("Buscando por: " + termo);
    }
}
