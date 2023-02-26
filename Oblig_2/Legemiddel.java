public abstract class Legemiddel {
    // Deklarering av variabler.
    public final String navn;
    int pris;
    public final double virkestoff;    

    protected Legemiddel(String navn, int pris, double virkestoff) {
        this.navn = navn;
        this.pris = pris;
        this.virkestoff = virkestoff;
    }

    public String toString() {
        return "Navn: " + navn + " Pris: " + pris + " Virkestoff: " + virkestoff;
    }

    protected int hentPris() {
        return pris;
    }

    protected void settNyPris(int nyPris) {
        pris = nyPris;
    }
}
