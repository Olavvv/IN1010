public class Lege implements Comparable<Lege> {
    String navn;
    IndeksertListe<Resept> utskrevneResepter;
    
    @Override
    public int compareTo(Lege lege) {
        // Antar at alle leges navn er paa formen: "Dr. navn"
        return navn.split(". ")[1].compareTo(lege.navn.split(". ")[1]);
    }

    public Resept skrivResept(Legemiddel legemiddel, Pasient pasient, int reit) { //throws UlovligUtskrift {
        Resept nyResept = new HvitResept(legemiddel, this, pasient, reit);
        utskrevneResepter.leggTil(nyResept);
        
        return nyResept;
    }

    public Lege(String navn) {
        this.navn = navn;
        utskrevneResepter = new IndeksertListe<Resept>();
    }

    public String toString() {
        return " Navn: " + navn;
    }

    public String hentNavn() {
        return navn;
    }
}
