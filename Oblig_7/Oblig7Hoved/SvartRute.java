public class SvartRute extends Rute {
    public SvartRute(int rad, int kol) {
        super(rad, kol);
    }

    // Svarte ruter kaller ikke finn på noen andre ruter.
    @Override
    public void finn(Rute fra) {
        if (fra == null) {
            System.out.println("Kan ikke starte i svart rute!");
        }
        return;
    }

    public String toString() {
        String output = "#";
        return output;
    }
}
