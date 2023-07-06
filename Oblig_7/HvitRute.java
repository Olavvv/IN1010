// Hvite ruter oppfører seg helt "normalt", 
// behøver derfor ikke å redefinere finn-metoden.
public class HvitRute extends Rute {

    public HvitRute(int rad, int kol) {
        super(rad, kol);
    }

    public String toString() {
        String output = ".";
        return output;
    }
}