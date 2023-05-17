package observer;



class OuvinteRegistroMusical implements OuvinteEventoMusical {
    private String mensagem;

    public OuvinteRegistroMusical(String mensagem) {
        this.mensagem = mensagem;
    }

    public void atualizar(String musica) {
        System.out.println(mensagem.replace("%s", musica));
    }
}
