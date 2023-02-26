public class Narkotisk extends Legemiddel {
    public static int idNr = 0;
    public final int id;
    public final int styrke;

    public Narkotisk(String navn, int pris, double virkestoff, int styrke) {    
        super(navn, pris, virkestoff);
        this.styrke = styrke;

        id = idNr;
        idNr++;

    }

    public String toString() {
        super.toString();
        return super.toString() + " Styrke: " + styrke + " Id: " + id;
    }

}
