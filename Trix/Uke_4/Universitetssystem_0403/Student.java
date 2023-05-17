public abstract class Student extends Person {
    String navn;
    int alder;
    String kurs;
    String lerested;
    boolean tilgantEtterStengt;

    public Student(String navn, int alder, String kurs, String lerested) {
        super(navn, alder);
        this.kurs = kurs;
        this. lerested = lerested;
    }

    @Override
    public String toString() {
        return super.toString() + ". Kurs: " + kurs + ". Lærersted: " + lerested + ". Tilgang etter stengt: " + tilgantEtterStengt;
    }
}
