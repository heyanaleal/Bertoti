package observer;

public class Fa implements Observador {
    private String nome;

    public Fa(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }
}
