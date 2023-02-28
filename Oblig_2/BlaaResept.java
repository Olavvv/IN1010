public class BlaaResept extends Resept {

    public BlaaResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        super(legemiddel, utskrivendeLege, pasientId, reit);
    }   

    @Override
    public String toString() {
        return "Type: Blaa" + ". Pris aa Betale: " + (int)Math.round(legemiddel.pris*0.25) + super.toString();
    }

    public String farge() {
        return "blaa";
    }

    // Returnerer prisen pasienten maa betale, uten aa endre paa prisen til legemiddel objektet.
    public int prisAaBetale() {
        return (int)Math.round(legemiddel.pris*0.25);
    }
}
