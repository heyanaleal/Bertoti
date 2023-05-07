package strategy;

class MusicaAcustica implements EstrategiaMusica {
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música acústica do Justin Bieber!");
    }
}