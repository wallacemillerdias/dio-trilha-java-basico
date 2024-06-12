public class Main {
    public static void main(String[] args) {

        Iphone reprodutorMusical = new Iphone();
        Iphone aparelhoTelefonico = new Iphone();
        Iphone navegadorInternet = new Iphone();
        
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica("Pais e filhos");

        aparelhoTelefonico.ligar("61-123456789");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        navegadorInternet.exibirPagina("http://www.dio.com");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();


    }
}
