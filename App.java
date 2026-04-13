public class App {
    public static void main(String[] args) throws Exception {
        Iphone meuIphone = new Iphone();

        System.out.println("--- Testando Reprodutor Musical ---");
        meuIphone.selecionarMusica("Red Hot Chili Peppers - Californication");
        meuIphone.tocar();
        meuIphone.pausar();

        System.out.println("\n--- Testando Aparelho Telefônico ---");
        meuIphone.ligar("(99) 99999-7777");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("\n--- Testando Navegador na Internet ---");
        meuIphone.exibirPagina("www.github.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
