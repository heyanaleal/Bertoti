package observer;

public class AplicacaoMusical {
    public void configurar() {
        ReprodutorMusical reprodutor = new ReprodutorMusical();

        OuvinteRegistroMusical logger = new OuvinteRegistroMusical(
            "Tocando agora: %s");
        reprodutor.eventos.inscrever("reproducao", logger);

        // Outros ouvintes e configurações podem ser adicionados aqui

        // Exemplo de uso:
        reprodutor.reproduzirMusica("Nome da Música");
        // Isso acionará a notificação para o ouvinte logger
    }

    public static void main(String[] args) {
        AplicacaoMusical aplicacao = new AplicacaoMusical();
        aplicacao.configurar();
    }
}
