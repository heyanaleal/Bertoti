package strategy;

public class MusicaPop implements EstrategiaMusica {
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música pop do Justin Bieber!");
    }
}