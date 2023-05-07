package composite;

class Musica implements ComponenteMusical {
    private String nome;

    public Musica(String nome) {
        this.nome = nome;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música: " + nome);
    }
}