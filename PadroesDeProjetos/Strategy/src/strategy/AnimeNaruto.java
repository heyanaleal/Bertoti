package strategy;

public class AnimeNaruto {
    public static void main(String[] args) {
        Ninja naruto = new Ninja(new Rasengan());
        naruto.executarJutsu();

        Ninja sasuke = new Ninja(new Chidori());
        sasuke.executarJutsu();
    }
}