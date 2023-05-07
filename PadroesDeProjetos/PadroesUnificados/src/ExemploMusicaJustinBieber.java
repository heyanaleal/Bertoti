import observer.*;
import facade.*;
import strategy.*;

public class ExemploMusicaJustinBieber {
    public static void main(String[] args) {
        // Criação de fãs
        Fa fa1 = new Fa("João");
        Fa fa2 = new Fa("Maria");

        // Adicionando fãs ao Justin Bieber
        FachadaMusical fachadaMusical = new FachadaMusical();
        fachadaMusical.adicionarFa(fa1);
        fachadaMusical.adicionarFa(fa2);

        // Notificando fãs
        fachadaMusical.notificarFas("Novo álbum lançado!");

        // Definindo estratégia de música
        fachadaMusical.definirEstrategia(new MusicaPop());

        // Tocando música
        fachadaMusical.tocar();
    }
}