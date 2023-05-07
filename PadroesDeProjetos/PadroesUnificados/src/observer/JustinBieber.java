package observer;

import java.util.ArrayList;
import java.util.List;

public class JustinBieber {
    private List<Observador> fas = new ArrayList<>();

    public void adicionarFa(Observador fa) {
        fas.add(fa);
    }

    public void notificarFas(String mensagem) {
        for (Observador fa : fas) {
            fa.atualizar(mensagem);
        }
    }
}
