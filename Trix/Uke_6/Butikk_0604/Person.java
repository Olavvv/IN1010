public class Person {
    public String navn;
    public String gjenstand;
    public Person neste;

    public Person(String navn, String gjenstand) {
        this.navn = navn;
        this.gjenstand = gjenstand;
    }

    public String toString() {
        return navn + " kjøper " + gjenstand;
    }
}