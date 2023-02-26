public class Vanlig extends Legemiddel {
    public static int idNr;
    public final int id;


    public Vanlig(String navn, int pris, double virkestoff) {
        super(navn, pris, virkestoff);

        id = idNr;
        idNr++;
    }

    public String toString() {
        return super.toString() +" Id: " + id;
    }
}
