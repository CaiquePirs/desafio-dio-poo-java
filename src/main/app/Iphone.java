public class Iphone implements Telefone, Navegador, ReprodutorMusical {

    private String modelo;
    private String cor;

    Iphone(String modelo, String cor){
        this.modelo = modelo;
        this.cor = cor;
    }

    public void atender(){
        System.out.println("Atendendo chamada");
    };

    public void ligar(String numero){
        System.out.println("Ligando para o numero: " + numero);
    };

    public void desligar(){
        System.out.println("Desligando chamada");
    };

    public void adicionarTelefone(String telefone){
        System.out.println("Numero: " + telefone + "adicionado");
    };

    public void excluirTelefone(String telefone){
        System.out.println("Telefone excluído");
    };

    public void adicionarNovaAba(){
        System.out.println("Aba adicionada");
    };

    public void exibirPagina(String url){
        System.out.println("Exibindo página: " + url);
    };

    public void pesquisar(String texto){
        System.out.println("Pesquisando: " + texto);
    };

    public void atualizarPagina(){
        System.out.println("Página atualizada");
    };

    public void tocar(){
        System.out.println("Tocando musica");

    };

    public void pausar(){
        System.out.println("Pausando musica");
    };

    public void selecionarMusica(String musica){
        System.out.println("Musica: " + musica + "Selecionada");
    };

    public void excluirMusica(String musica){
        System.out.println("Excluindo musica: " + musica);
    };
}
