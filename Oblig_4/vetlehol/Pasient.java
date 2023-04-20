public class Pasient {
    String navn;
    String foedselsnummer;
    IndeksertListe<Resept> resepter;

    static int idNr = 0;
    int id;

    public Pasient(String navn, String foedselsnummer) {
        this.navn = navn;
        this.foedselsnummer = foedselsnummer;
        resepter = new IndeksertListe<Resept>();

        id = idNr;
        idNr++;

    }

    public String toString() {
        return "Navn: " + navn + " Id: " + id + " Foedselsnummer: " + foedselsnummer;

    }
}
