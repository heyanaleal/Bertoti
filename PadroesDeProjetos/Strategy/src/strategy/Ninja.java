package strategy;

class Ninja {
    private EstrategiaJutsu jutsu;

    public Ninja(EstrategiaJutsu jutsu) {
        this.jutsu = jutsu;
    }

    public void setJutsu(EstrategiaJutsu jutsu) {
        this.jutsu = jutsu;
    }

    public void executarJutsu() {
        jutsu.usarJutsu();
    }
}