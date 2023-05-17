/*
 * Buss klassen har 'int antallSitteplasser' 
 * i tillegg til de andre egenskapene
 * til Kjoretoy klassen
 */

public class Buss extends Kjoretoy {
    public int antallSitteplasser;

    public Buss(String registreringsNr, String fabrikkMerke, 
    String eierensNavn, int antallSitteplasser) {
        super(registreringsNr, fabrikkMerke, eierensNavn);
        this.antallSitteplasser = antallSitteplasser;
    }

    public String toString() {
        String output = "";
        output += "RegNr: " + registreringsNr + ". Fabrikkmerke: " + fabrikkMerke
        + ". Eiers navn: " + eierensNavn + ". Antall sitteplasser: " + antallSitteplasser;
        return output;
    }
    
}
