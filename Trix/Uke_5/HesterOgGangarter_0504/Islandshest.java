public class Islandshest extends Hest implements KanToelte, KanPasse {
    public Islandshest(String navn, int alder) {
        super(navn, alder);
    }

    public void toelt() {
        System.out.println("en firtaktig gangart der det kan se ut som om hesten skritter i raskt tempo, med hevede bein.");
    }

    public void pass() {
        System.out.println("en totaktig gangart der hesten kan se ut som den svever");
    }
}
