public class Personbil extends Kjoretoy {
    public int antallSitteplasser;

    public Personbil(String registreringsNr, String fabrikkMerke, 
    String eierensNavn, int antallSitteplasser) {
        super(registreringsNr, fabrikkMerke, eierensNavn);
        this.antallSitteplasser = antallSitteplasser;

        aarsavgift = 3000;
    }

    public String toString() {
        String output = "";
        output += "RegNr: " + registreringsNr + ". Fabrikkmerke: " + fabrikkMerke
        + ". Eiers navn: " + eierensNavn + ". Antall sitteplasser: " 
        + antallSitteplasser + ". Årsavgift: " + aarsavgift;
        return output;
    }
}
