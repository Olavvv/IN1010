public class Aapning extends HvitRute {
    public Aapning(int rad, int kol) {
        super(rad,kol);
    }

    // Dersom finn metoden blir kalt på en aapning, skriver den bare ut posisjonen sin.
    @Override
    public void finn(Rute fra) {
        System.out.println("(" + radNummer + ", " + kolonneNummer + ")");
    }
}
