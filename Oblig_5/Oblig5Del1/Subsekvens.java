public class Subsekvens {
    private int antall;
    public final String subsekvens;
    public Subsekvens(int antall, String sekvens) {
        this.antall = antall;
        subsekvens = sekvens;
    }

    public String toString() {
        return " ("+ subsekvens + ","+antall+") ";
    }

    public int hentAntall() {
        return antall;
    }

    public void endreAntall(int nyAntall) {
        antall = nyAntall;
    }

}