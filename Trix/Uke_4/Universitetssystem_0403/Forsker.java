public class Forsker extends Ansatt {
    String fagomraade;

    public Forsker(String navn, int alder, double timeslonn, String fagomraade) {
        super(navn, alder, timeslonn);
        this.fagomraade = fagomraade;
    }
    
    public String toString() {
        return super.toString() + ". Fagområde: " + fagomraade;
    }
}
