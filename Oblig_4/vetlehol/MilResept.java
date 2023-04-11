public class MilResept extends HvitResept {

    public MilResept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient) {
        super(legemiddel, utskrivendeLege, pasient, 3); 
        
        prisAaBetale = 0;
    }

    @Override
    public String toString() {
        return "Type: Militaer Resept" + ". Pris aa Betale: " + prisAaBetale + " Legemiddel: " + legemiddel + ". Utskrivende lege: " + utskrivendeLege + 
        ". Pasient ID: " + pasient.id + ". Reit: " + reit;
    }

}
