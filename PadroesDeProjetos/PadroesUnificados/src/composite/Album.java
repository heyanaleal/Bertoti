package composite;

import java.util.ArrayList;
import java.util.List;

class Album implements ComponenteMusical {
    private List<ComponenteMusical> musicas = new ArrayList<>();

    public void adicionarMusica(ComponenteMusical musica) {
        musicas.add(musica);
    }

    @Override
    public void tocar() {
        for (ComponenteMusical musica : musicas) {
            musica.tocar();
        }
    }
}
