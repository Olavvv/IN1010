public class MilResept extends HvitResept {

    public MilResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId) {
        super(legemiddel, utskrivendeLege, pasientId, 3); 
        
        prisAaBetale = 0;
    }

    @Override
    public String toString() {
        return "Type: Militaer Resept" + ". Pris aa Betale: " + prisAaBetale + " Legemiddel: " + legemiddel + ". Utskrivende lege: " + utskrivendeLege + 
        ". Pasient ID: " + pasientId + ". Reit: " + reit;
    }

}
