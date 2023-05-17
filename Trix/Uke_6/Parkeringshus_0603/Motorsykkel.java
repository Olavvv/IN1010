public class Motorsykkel {
    String registreringsNummer;
    int motorstoerrelse;

    public Motorsykkel(String registreringsNummer, int motorstoerrelse) {
        this.registreringsNummer = registreringsNummer;
        this.motorstoerrelse = motorstoerrelse;
    }

    public String toString() {
        return "Type: Motorsykkel. Registreringsnummer: " + registreringsNummer + 
        "Motorstørrelse: " + motorstoerrelse;
    }
}
