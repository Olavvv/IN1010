public class Pasient {
    String navn;
    String foedselsnummer;
    IndeksertListe<Resept> resepter;

    static int idNr = 0;
    int id;

    public Pasient(String navn, String foedselsnummer, IndeksertListe<Resept> resepter) {
        this.navn = navn;
        this.foedselsnummer = foedselsnummer;
        this.resepter = resepter;

        id = idNr;
        idNr++;

    }
}
