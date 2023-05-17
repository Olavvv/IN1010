public class Master extends Student {
    public Master(String navn, int alder, String kurs, String lerested) {
        super(navn, alder, kurs, lerested);
        tilgantEtterStengt = true;
    }
}
