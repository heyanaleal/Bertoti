package patternsObserver;

public class Main {
    public static void main(String[] args) {
        Animal leao = new Animal("Leão", "Rugido");

        FuncionarioZoo um = new FuncionarioZoo("João");
        FuncionarioZoo dois = new FuncionarioZoo("Alice");

        leao.registrarObserver(um);
        leao.registrarObserver(dois);

        leao.setsom("Miado");

        leao.notificarObservers();
    }
}
