public class HvitResept extends Resept {

    // En variabel vi kan endre uten aa endre legemiddel objektet sin pris
    int prisAaBetale; 

    public HvitResept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient, int reit) {
        super(legemiddel, utskrivendeLege, pasient, reit);
        prisAaBetale = legemiddel.pris;
    }

    @Override
    public String toString() {
        return "Type: Hvit" + ". Pris aa Betale: " + prisAaBetale + super.toString();
    }

    public String farge() {
        return "hvit";
    }

    public int prisAaBetale() {
        return prisAaBetale;
    }
    
}
