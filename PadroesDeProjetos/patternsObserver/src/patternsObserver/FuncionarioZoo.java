package patternsObserver;

class FuncionarioZoo implements AnimalObserver {
    private String nome;

    public FuncionarioZoo(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String nome, String som) {
        System.out.println(this.nome + " ouviu " + som + " do " + nome);
    }
}