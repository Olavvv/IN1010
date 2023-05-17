public class TestBoks {
    public static void main(String[] args) {
        Boks boks1 = new Boks(2, 3, 4);
        Boks boks2 = new Boks(1, 2, 3);
        int areal1 = (2*3*2) + (3*4*2) + (4*2*2);
        int vol1 = 2*3*4;
        int areal2 = (1*2*2) + (2*3*2) + (3*1*2);
        int vol2 = 1*2*3;

        int antFeil = 0;
        String feilMelding = "[";

        // Test 1: beregnAreal().
        if (boks1.beregnAreal() == areal1 && boks2.beregnAreal() == areal2) {
            System.out.println("Riktig for test 1.");
        }
        else {
            System.out.println("Feil for test 1.");
            antFeil++;
            feilMelding += " Test 1 ";
        }

        // Test beregnVolum().
        if (boks1.beregnVolum() == vol1 && boks2.beregnVolum() == vol2) {
            System.out.println("Riktig for test 2.");
        }
        else {
            System.out.println("Feil for test 2.");
            antFeil++;
            feilMelding += " Test 2 ";
        }
        feilMelding += "]";

        // Resultat for tester.
        if (antFeil == 0) {
            System.out.println("Alt riktig!");
        }
        else {
            System.out.println("Feil i metode(r).");
            System.out.println("Feil i: " + feilMelding + ". " + antFeil + "/2 tester riktig.");
        }
    }   
}
