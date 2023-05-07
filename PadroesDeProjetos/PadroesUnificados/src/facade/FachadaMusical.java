package facade;
import observer.*;
import singleton.*;
import strategy.*;

public class FachadaMusical {
    private JustinBieber justinBieber = new JustinBieber();
    private TocadorDeMusica tocadorDeMusica = TocadorDeMusica.getInstancia();

    public void adicionarFa(Observador fa) {
        justinBieber.adicionarFa(fa);
    }

    public void notificarFas(String mensagem) {
        justinBieber.notificarFas(mensagem);
    }

    public void definirEstrategia(EstrategiaMusica estrategia) {
        tocadorDeMusica.definirEstrategia(estrategia);
    }

    public void tocar() {
        tocadorDeMusica.tocar();
    }
}