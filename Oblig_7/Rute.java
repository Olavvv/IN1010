public abstract class Rute {
    public int radNummer;
    public int kolonneNummer;
    public Labyrint labyrint;
    public Rute nord, syd, vest, oest;

    public Rute(int rad, int kol) {
        radNummer = rad;
        kolonneNummer = kol;
    }


    // Kaller finn metoden på alle naboruter.
    // Unntatt på den metode-kallet kommer fra.
    public void finn(Rute fra) {
        if (fra == null) {
            nord.finn(this);
            syd.finn(this);
            oest.finn(this);
            vest.finn(this);
            return;
        }
        else {
            if (nord != fra && nord != null) {
                nord.finn(this);
            }
            if (syd != fra && syd != null) {
                syd.finn(this);
            }
            if (vest != fra && vest != null) {
                vest.finn(this);
            }
            if (oest != fra && oest != null) {
                oest.finn(this);
            }
        }
    }
}
