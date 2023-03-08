public interface Musica {
    void tocar();
}

public class MusicaRock implements Musica {
    @Override
    public void tocar() {
    }
}

public class MusicaPop implements Musica {
    @Override
    public void tocar() {
    }
}

public class MusicaJazz implements Musica {
    @Override
    public void tocar() {
    }
}

public class Fabrica {
    public Musica criarMusica() {
    }
}
