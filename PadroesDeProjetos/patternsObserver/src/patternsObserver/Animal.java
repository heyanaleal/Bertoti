package patternsObserver;

import java.util.ArrayList;
import java.util.List;

class Animal implements AnimalSubject {
    private String nome;
    private String som;
    private List<AnimalObserver> observers;

    public Animal(String nome, String som) {
        this.nome = nome;
        this.som = som;
        this.observers = new ArrayList<>();
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public void setsom(String som) {
        this.som = som;
    }

    @Override
    public void registrarObserver(AnimalObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(AnimalObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers() {
        for (AnimalObserver observer : observers) {
            observer.atualizar(nome, som);
        }
    }
}