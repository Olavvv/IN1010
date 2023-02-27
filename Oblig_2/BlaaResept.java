public class BlaaResept extends Resept {

    public BlaaResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        super(legemiddel, utskrivendeLege, pasientId, reit);

        legemiddel.pris = (int)Math.round(legemiddel.pris*0.25);
    }   

    public String farge() {
        return "blaa";
    }

    public int prisAaBetale() {
        return legemiddel.pris;
    }
}
