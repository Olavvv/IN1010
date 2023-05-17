/*
 * Varebil har max lastevekt.
 */

public class Varebil extends Kjoretoy {
    public int maxLastevekt;
    
    public Varebil(String registreringsNr, String fabrikkMerke, 
    String eierensNavn, int maxLastevekt) {
        super(registreringsNr, fabrikkMerke, eierensNavn);
        this.maxLastevekt = maxLastevekt;

        aarsavgift = 4*maxLastevekt;
    }

    public String toString() {
        String output = "";
        output += "RegNr: " + registreringsNr + ". Fabrikkmerke: " + fabrikkMerke
        + ". Eiers navn: " + eierensNavn + ". Max lastevekt: " + maxLastevekt
        + ". Årsavgift: " + aarsavgift;
        return output;
    }
}
        
