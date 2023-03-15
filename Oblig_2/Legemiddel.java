public abstract class Legemiddel {
    // Deklarering av variabler.
    public final String navn;
    public int pris;
    public final double virkestoff; 

    public final int id;  
    public static int idNr = 0;

    protected Legemiddel(String navn, int pris, double virkestoff) {
        this.navn = navn;
        this.pris = pris;
        this.virkestoff = virkestoff;

        id = idNr;
        idNr++;
    }

    public String toString() {
        return " Navn: " + navn + " Pris: " + pris + " Virkestoff: " + virkestoff;
    }

    protected int hentPris() {
        return pris;
    }

    protected void settNyPris(int nyPris) {
        pris = nyPris;
    }
}
