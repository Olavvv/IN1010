public class Narkotisk extends Legemiddel {
    public static int idNr = 0;
    protected final int id;
    public final int styrke;

    public Narkotisk(String navn, int pris, double virkestoff, int styrke) {    
        super(navn, pris, virkestoff);
        this.styrke = styrke;

        id = idNr;
        idNr++;

    }

    @Override
    public String toString() {
        return super.toString() + " Styrke: " + styrke + " Id: " + id;
    }

}
