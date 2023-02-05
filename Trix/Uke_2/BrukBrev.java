public class BrukBrev {
    public static void main(String[] arg) {
        Brev brevet = new Brev("Per Askeladd", "Espen Askeladd");
        brevet.skrivLinje("Hvordan har du det?");
        brevet.skrivLinje("Jeg har det bare bra!");
        brevet.lesBrev();
    }
}
