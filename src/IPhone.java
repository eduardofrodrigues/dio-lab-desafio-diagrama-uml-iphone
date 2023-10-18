import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar(int numeroTelefonico) {
        System.out.println("Ligando para " + numeroTelefonico+".");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Não foi possível atender, iniciando correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo o endereço: "+url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo uma nova aba vazia.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando páginas.");
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Tocando música: " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica.");
    }

    public static void main(String[] args) {
        IPhone celular = new IPhone();

        celular.tocar("CCB Hinos");
        celular.exibirPagina("google.com");
        celular.ligar(1599889565);

    }

}
