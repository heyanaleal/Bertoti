package composite;

public class Main {
	   public static void main(String[] args) {
	        Pikachu pikachu = new Pikachu();

	        EquipePokemon equipe = new EquipePokemon();
	        equipe.adicionar(pikachu);

	        equipe.mostrar();
	    }
	}