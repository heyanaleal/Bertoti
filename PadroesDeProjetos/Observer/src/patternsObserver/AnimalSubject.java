package patternsObserver;

public interface AnimalSubject {
    void registrarObserver(AnimalObserver observer);
    void removerObserver(AnimalObserver observer);
    void notificarObservers();
}
