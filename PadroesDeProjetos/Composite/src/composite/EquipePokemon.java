package composite;

import java.util.ArrayList;
import java.util.List;

class EquipePokemon implements Pokemon {
    private List<Pokemon> pokemons = new ArrayList<>();

    public void adicionar(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    public void remover(Pokemon pokemon) {
        pokemons.remove(pokemon);
    }

    public void mostrar() {
        for (Pokemon pokemon : pokemons) {
            pokemon.mostrar();
        }
    }
}