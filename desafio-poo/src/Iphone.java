public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {


    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo telefone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página com a url: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    public void tocar() {
        System.out.println("Tocando a música");
    }

    public void pausar() {
        System.out.println("Pausando a música");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música : " + musica);
    }
}
