public class Rutenett {
    // Deklarering av variabler.
    public int antRader;
    public int antKolonner;
    public Celle[][] rutene;

    public Rutenett(int rader, int kolonner) {
        antRader = rader;
        antKolonner = kolonner;

        rutene = new Celle[antRader][antKolonner];
    }

    // Plasserer en ny celle i rutenettet.
    public void lagCelle(int rad, int kol) {
        Celle celle = new Celle();
        if (Math.random() <= 0.3333) {
            celle.settLevende();
        }

        rutene[rad][kol] = celle;
    }

    // Fyller rutenettet med tilfeldige celler ved å kalle lagCelle-metoden.
    public void fyllMedTilfeldigeCeller() {

        // For hver rad: gaa gjennom kolonnen for den raden og fyll den med celler.
        for (int rad = 0; rad < rutene.length; rad++) {
            for (int kol = 0; kol < rutene[0].length; kol ++) {
                lagCelle(rad, kol);
            }
        }
    }

    // Henter ut en celle.
    public Celle hentCelle(int rad, int kol) {
        if (rad >= rutene.length || kol >= rutene[0].length) {
            return null;
        }
        return rutene[rad][kol];
    }
}
