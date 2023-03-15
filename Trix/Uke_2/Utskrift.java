public class Utskrift {
    public static void main(String[] args) {
        String enTekst = "jeg er kul";
        int etTall = 9;
        int toTall = 1;

        utskrift(enTekst);
        utskrift(etTall);
        utskrift(etTall, toTall);
    }

    public static void utskrift(String tekst) {
        System.out.println(tekst);
    }

    public static void utskrift(int tall) {
        System.out.println(tall);
    }

    public static void utskrift(int tall1, int tall2) {
        System.out.println("Summen av tallene er: " + (tall1 + tall2));
    }
    
}
