public abstract class Person {
    public int alder;
    public String navn;

    public Person(String navn, int alder) {
        this.alder = alder;
        this.navn = navn;
    }

    public String toString() {
        return "Navn: " + navn + ". Alder: " + alder;
    }
}