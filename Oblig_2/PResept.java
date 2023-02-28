public class PResept extends HvitResept {
    final int rabatt = 108;

    public PResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        super(legemiddel, utskrivendeLege, pasientId, reit);
        prisAaBetale = legemiddel.pris - rabatt; 

        if (prisAaBetale < 0) prisAaBetale = 0;
    }    

    @Override
    public String toString() {
        return "Type: P-Resept" + ". Pris aa Betale: " + prisAaBetale + " Legemiddel: " + legemiddel + ". Utskrivende lege: " + utskrivendeLege + 
        ". Pasient ID: " + pasientId + ". Reit: " + reit;
    }
}
