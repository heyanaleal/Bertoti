package facade;

class StrangerThingsFacade {
    private MundoInvertido mundoInvertido;
    private Demogorgon demogorgon;
    private Onze onze;

    public StrangerThingsFacade() {
        mundoInvertido = new MundoInvertido();
        demogorgon = new Demogorgon();
        onze = new Onze();
    }

    public void cenaMundoInvertido() {
        mundoInvertido.entrar();
        mundoInvertido.explorar();
        demogorgon.aparecer();
        onze.usarPoderes();
        demogorgon.desaparecer();
        mundoInvertido.sair();
    }
}
