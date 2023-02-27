public class HvitResept extends Resept {
    public HvitResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        super(legemiddel, utskrivendeLege, pasientId, reit);
    }

    public toString() {

    }

    public String farge() {
        return "hvit";
    }

    public int prisAaBetale() {
        return legemiddel.pris;
    }
    
}
