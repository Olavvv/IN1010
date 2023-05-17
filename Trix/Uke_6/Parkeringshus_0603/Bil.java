public class Bil {
    String registreringsNummer;
    int antallPassasjerSeter;

    public Bil(String regNr, int antallPasSet) {
        registreringsNummer = regNr;
        antallPassasjerSeter = antallPasSet; 
    }

    public String toString() {
        return "Type: Bil. Registreringsnummer: " + registreringsNummer +
        ". Antall passasjerseter: " + antallPassasjerSeter;
    }
}