public class TestFigur {
    public static void main(String[] args) {
        Sirkel sirkel = new Sirkel(4);
        Rektangel rektangel = new Rektangel(3, 7);

        int antFeil = 0;
        String feilMelding = "[";

        // Test #1 for beregnAreal rektangel.
        if (rektangel.beregnAreal() != 21) {
            antFeil++;
            feilMelding += " Test 1 ";
        }
        
        // Test #2 for beregnOmkrets rektangel. 
        if (rektangel.beregnOmkrets() != 20) {
            antFeil++;
            feilMelding += " Test 2 ";
        }

        // Test #3 for beregnAreal sirkel. 
        if (sirkel.beregnAreal() != 16*Math.PI) {
            antFeil++;
            feilMelding += " Test 3 ";
        }

        // Test #4 for beregnOmkrets sirkel.
        if (sirkel.beregnOmkrets() != 4*2*Math.PI) {
            antFeil++;
            feilMelding += " Test 4 ";
        }
        feilMelding += "]";
        
        if (antFeil == 0) {
            System.out.println("Alt riktig!");
        }
        else {
            System.out.println("Feil i: " + feilMelding);
            System.out.println(antFeil + "/4 tester feil.");
        }
    }
}
