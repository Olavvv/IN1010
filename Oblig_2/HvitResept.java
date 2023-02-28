public class HvitResept extends Resept {

    // En variabel vi kan endre uten aa endre legemiddel objektet sin pris
    int prisAaBetale; 

    public HvitResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        super(legemiddel, utskrivendeLege, pasientId, reit);
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
