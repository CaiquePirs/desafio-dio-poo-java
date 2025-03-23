public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone 12", "Dourado");

        System.out.println("\t---Modelo: " + iphone.getModelo() + " Cor: " + iphone.getCor() + "---");

        System.out.println("Função chamada:");
        iphone.ligar("(71) 99334-8746");
        iphone.desligar();
        iphone.adicionarTelefone("(75) 98745-3457");
        iphone.excluirTelefone("(75) 98745-3457");

        System.out.println("\nFunção navegador:");
        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://localhost/pagina");
        iphone.pesquisar("Capinha de iphone 12");
        iphone.atualizarPagina();

        System.out.println("\nFunção reprodutor musical:");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Lugar secreto - Gabriela Rocha");
        iphone.excluirMusica("It Will Rain - Bruno mars");

    }
}
