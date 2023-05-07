package composite;

public class Main {
	   public static void main(String[] args) {
	        Pikachu pikachu = new Pikachu();
	        Charmander charmander = new Charmander();

	        EquipePokemon equipe = new EquipePokemon();
	        equipe.adicionar(pikachu);
	        equipe.adicionar(charmander);

	        equipe.mostrar();
	    }
	}