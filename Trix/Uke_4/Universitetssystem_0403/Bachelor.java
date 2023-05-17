public class Bachelor extends Student {
    public Bachelor(String navn, int alder, String kurs, String lerested) {
        super(navn, alder, kurs, lerested);
        tilgantEtterStengt = false;
    }
}
