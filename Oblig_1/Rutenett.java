import javax.lang.model.type.NullType;

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
        for (int rad = 0; rad < antRader; rad++) {
            for (int kol = 0; kol < antKolonner; kol ++) {
                lagCelle(rad, kol);
            }
        }
    }

    // Henter ut en celle.
    public Celle hentCelle(int rad, int kol) {
        if (rad >= rutene.length || kol >= rutene[0].length || rad < 0 || kol < 0) {
            return null;
        }
        return rutene[rad][kol];
    }

    public void tegnRutenett() {
        // Lager plass foer utskrift.
        for (int i = 0; i <= 10; i++) {
            System.out.print("\n");
        }

        // Henter statustegnene.
        for (int rad = 0; rad < rutene.length; rad++) {
            System.out.print("+---".repeat(rutene[0].length));
            System.out.print("+\n");
            for (int kol = 0; kol < rutene[0].length; kol++) {
                System.out.print("|");
                System.out.print(" " + rutene[rad][kol].hentStatusTegn() + " ");    
            }
            System.out.print("|");
            System.out.print("\n");
    
        }
        System.out.print("+---".repeat(rutene[0].length));
        System.out.print("+\n");
    }

    // Loeper gjennom alle mulige naboer.
    // Filtrerer ut null-naboer, altsaa naboer utenfor gridet.
    public void settNaboer(int rad, int kol) {
        Celle celle = hentCelle(rad, kol);    
        for (int i = (rad-1); i < (rad+2); i++) {
            for (int j = (kol-1); j < (kol+2); j++) {
                if (i == rad && j == kol) {
                    j++;
                }
                if (hentCelle(i,j) != null) {
                    celle.leggTilNabo(hentCelle(i, j));      
               } 
            }
        }
    }

    // Kaller metoden 'settNaboer()' for alle celler i griddet.
    public void kobleAlleCeller() {
        for (int rad = 0; rad < antRader; rad++) {
            for (int kol = 0; kol < antKolonner; kol++) {
                settNaboer(rad, kol);
            }
        }
    }

    // Returnerer antall levende celler i rutenettet.
    public int antallLevende() {
        int antallLevendeCeller = 0;
        for (int rad = 0; rad < antRader; rad++) {
            for (int kol = 0; kol < antKolonner; kol++) {
                if (rutene[rad][kol].erLevende()) {
                    antallLevendeCeller++;
                }
            }
        }
        return antallLevendeCeller;
    }
}
