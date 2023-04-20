public class Subsekvens {
    private int antall;
    
    public Subsekvens(int antall, String sekvens) {
        this.antall = antall;
        final String subsekvens = sekvens;
    }

    public int hentAntall() {
        return antall;
    }

    public void endreAntall(int nyAntall) {
        antall = nyAntall;
    }

    //Husk tostring metode.
}