public class PasoFino extends Hest implements KanToelte {
    public PasoFino(String navn, int alder) {
        super(navn, alder);
    }

    public void toelt() {
        System.out.println("en firtaktig gangart der det kan se ut som om hesten skritter i raskt tempo, med hevede bein.");
    }
}
