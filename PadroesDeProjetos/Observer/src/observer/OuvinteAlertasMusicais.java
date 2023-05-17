package observer;

class OuvinteAlertasMusicais implements OuvinteEventoMusical {
    private String email;
    private String mensagem;

    public OuvinteAlertasMusicais(String email, String mensagem) {
        this.email = email;
        this.mensagem = mensagem;
    }

    public void atualizar(String musica) {
        enviarEmail(email, mensagem.replace("%s", musica));
    }

    private void enviarEmail(String destinatario, String conteudo) {
        // Lógica de envio de e-mail
        System.out.println("Enviando e-mail para: " + destinatario);
        System.out.println("Conteúdo: " + conteudo);
    }
}
