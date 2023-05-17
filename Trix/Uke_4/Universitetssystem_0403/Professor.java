public class Professor extends Ansatt {
    String kurs;
    String fagomraade;

    public Professor(String navn, int alder, double timeslonn, String kurs, String fagomraade) {
        super(navn, alder, timeslonn);
        this.kurs = kurs;
        this. fagomraade = fagomraade;
    }

    public String toString() {
        return super.toString() + ". Kurs: " + kurs + ". Fagområde: " +fagomraade;
    }
}
