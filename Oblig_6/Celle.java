public class Celle {
    public boolean levende;
    public int antNaboer;
    public Celle[] naboer;
    public int antLevendeNaboer;

    // Konstruktoer.
    public Celle() {
        levende = false;
        antNaboer = 0;
        naboer = new Celle[8];
        antLevendeNaboer = 0;
    }

    // Setter cellens status til doed.
    public void settDoed() {
        levende = false;
    }

    // Setter cellens status til levende.
    public void settLevende() {
        levende = true;
    }

    // Returnerer true dersom cellen lever.
    public boolean erLevende() {
        if (levende) {
            return true;
        }
        return false;
    }

    // Returnerer 'o' dersom cellen lever og '.' om cellen er doed.
    // 'o' og '.' er av typen 'char'.
    public char hentStatusTegn() {
        if (levende) {
            return 'O';
        }
        return '.';
    }

    // Legger til en nabo i nabo arrayet.
    public void leggTilNabo(Celle nabo) {
        naboer[antNaboer] = nabo;
        antNaboer++;
    }

    // Teller antall levende naboer. 
    public void tellLevendeNaboer() {
        antLevendeNaboer = 0; // Setter til 0 ved start.
        
        for (int i = 0; i < naboer.length; i++) {
            if (naboer[i] != null) {            
                if (naboer[i].erLevende()) {
                    antLevendeNaboer++;
                }
            }
        }
    }

    // Sjekker antall levende naboer hos cellen.
    // Setter doed eller levende i henhold til spillets regler.
    public void oppdaterStatus() {
        if (levende) {
            if (antLevendeNaboer < 2) {
                settDoed();
            }
            else if (antLevendeNaboer > 3) {
                settDoed();
            }
        }
        else {
            if (antLevendeNaboer == 3) {
                settLevende();
            }
        }
    }
}
