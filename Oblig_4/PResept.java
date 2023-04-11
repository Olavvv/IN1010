public class PResept extends HvitResept {
    final int rabatt = 108;

    public PResept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient, int reit) {
        super(legemiddel, utskrivendeLege, pasient, reit);
        prisAaBetale = legemiddel.pris - rabatt; 

        if (prisAaBetale < 0) prisAaBetale = 0;
    }    

    @Override
    public String toString() {
        return "Type: P-Resept" + ". Pris aa Betale: " + prisAaBetale + " Legemiddel: " + legemiddel + ". Utskrivende lege: " + utskrivendeLege + 
        ". Pasient ID: " + pasient.id + ". Reit: " + reit;
    }
}
