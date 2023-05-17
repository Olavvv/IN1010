public abstract class Ansatt extends Person {
    double timeslonn;

    public Ansatt(String navn, int alder, double timeslonn) {
        super(navn, alder);
        this.timeslonn = timeslonn;
    }

    public String toString() {
        return super.toString() + ". Timeslønn: " + timeslonn;
    }
}
