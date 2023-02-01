public class Bil3 {
    private String nummer;

    public Bil3(String bilNummer) {
        nummer = bilNummer;
    }

    public void skrivUt() {
        System.out.println("Jeg er en bil, og bilnummeret mitt er: " + nummer);
    }

    public String hentNummer() {
        return nummer;
    }
}
