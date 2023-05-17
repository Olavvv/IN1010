public abstract class Kjoretoy {
    public String registreringsNr;
    public String fabrikkMerke;
    public String eierensNavn;
    public int aarsavgift;

    public Kjoretoy(String registreringsNr, String fabrikkMerke, String eierensNavn) {
        this.registreringsNr = registreringsNr;
        this.fabrikkMerke = fabrikkMerke;
        this.eierensNavn = eierensNavn;
    }

    public abstract String toString();
}