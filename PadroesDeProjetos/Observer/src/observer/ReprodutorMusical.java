package observer;

class ReprodutorMusical {
    public GerenciadorEventosMusicais eventos;
    private String musicaAtual;

    public ReprodutorMusical() {
        eventos = new GerenciadorEventosMusicais();
    }

    public void reproduzirMusica(String musica) {
        musicaAtual = musica;
        eventos.notificar("reproducao", musicaAtual);
    }

    public void pausarMusica() {
        eventos.notificar("pausa", musicaAtual);
    }

    public void pararMusica() {
        eventos.notificar("parada", musicaAtual);
    }
    // ...
}
