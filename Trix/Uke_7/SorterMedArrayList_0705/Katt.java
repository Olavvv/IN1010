public class Katt implements Comparable<Katt>{
    String navn;
    int alder;

    public Katt(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }

    public String toString() {
        return "Navn: " + navn + ". Alder: " + alder;
    } 

    public int compareTo(Katt katt) {
        if (alder < katt.alder) {
            return -1;
        }
        else if (alder == katt.alder) {
            return 0;
        }
        else {
            return 1;
        }
    }
}