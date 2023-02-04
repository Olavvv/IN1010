public class Verden {
    // Deklarerer variabler.
    public Rutenett rutenett;
    public int genNr;

    public Verden(int rad, int kol) {
        // Starter med aa opprette et rutennett lage celler, naboer, osv.
        rutenett = new Rutenett(rad, kol);
        rutenett.fyllMedTilfeldigeCeller();
        rutenett.kobleAlleCeller();

        genNr = 0;
    }

    // Tegner rutenettet med generasjonsnummer.
    public void tegn() {
        rutenett.tegnRutenett();
        System.out.println("Generasjon: " + genNr);
        System.out.println("Antall Levende Celler: " + rutenett.antallLevende());
        System.out.println();
    }

    // Loeper gjennom rutenettet to ganger for aa opptadere alle cellene.
    public void oppdatering() {

        for (int i = 0; i < rutenett.antRader; i++) {
            for (int j = 0; j < rutenett.antKolonner; j++) {
                rutenett.rutene[i][j].tellLevendeNaboer();
            }
        }

        for (int i2 = 0; i2 < rutenett.antRader; i2++) {
            for (int j2 = 0; j2 < rutenett.antKolonner; j2++) {
                rutenett.rutene[i2][j2].oppdaterStatus();
            }
        }

        genNr++;
    }
}
