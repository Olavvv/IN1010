public class PResept extends HvitResept {
    final int rabatt = -108;

    public PResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        super(legemiddel, utskrivendeLege, pasientId, reit);
        legemiddel.pris += rabatt; 

        if (legemiddel.pris < 0) legemiddel.pris = 0;
    }    
}
