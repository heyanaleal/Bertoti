package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class GerenciadorEventosMusicais {
    private HashMap<String, List<OuvinteEventoMusical>> ouvintes;

    public GerenciadorEventosMusicais() {
        ouvintes = new HashMap<>();
    }

    public void inscrever(String tipoEvento, OuvinteEventoMusical ouvinte) {
        List<OuvinteEventoMusical> ouvintesEvento = ouvintes.getOrDefault(tipoEvento, new ArrayList<>());
        ouvintesEvento.add(ouvinte);
        ouvintes.put(tipoEvento, ouvintesEvento);
    }

    public void cancelarInscricao(String tipoEvento, OuvinteEventoMusical ouvinte) {
        List<OuvinteEventoMusical> ouvintesEvento = ouvintes.get(tipoEvento);
        if (ouvintesEvento != null) {
            ouvintesEvento.remove(ouvinte);
            if (ouvintesEvento.isEmpty()) {
                ouvintes.remove(tipoEvento);
            }
        }
    }

    public void notificar(String tipoEvento, String dados) {
        List<OuvinteEventoMusical> ouvintesEvento = ouvintes.get(tipoEvento);
        if (ouvintesEvento != null) {
            for (OuvinteEventoMusical ouvinte : ouvintesEvento) {
                ouvinte.atualizar(dados);
            }
        }
    }
}
