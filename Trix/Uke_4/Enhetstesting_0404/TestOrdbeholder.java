public class TestOrdbeholder {
    public static void main(String[] args) {
        Ordbeholder beholder = new Ordbeholder();
        int antallFeil = 0;
        
        // Test for pop() med ingen ord i beholderen.
        String pop = beholder.pop();
        if (pop == null) {
            System.out.println("pop() for ingen ord i liste fungerer!");
        }
        else {
            System.out.println("pop() for ingen ord i liste fungerer ikke :(");
            antallFeil++;
        }

        // Test for settInn() med nytt ord.
        if (beholder.settInn("3") == true) {
            System.out.println("settInn() for nytt ord fungerer!");
        }
        else {
            System.out.println("settInn() for nytt ord fungerer ikke :(");
            antallFeil++;
        }

        // Test for settInn() med ord som allerede er i beholder.
        if (beholder.settInn("3") == false) {
            System.out.println("settInn() for gammelt ord fungerer!");
        }
        else {
            System.out.println("settInn() for gammelt ord fungerer ikke :(");
            antallFeil++;
        }

        beholder.settInn("is");
        beholder.settInn("krem");
        beholder.settInn("stovel");
        beholder.settInn("godteri");

        // Test for antallOrd().
        if (beholder.antallOrd() == 5) {
            System.out.println("antallOrd() fungerer!");
        }
        else {
            System.out.println("antallOrd() fungerer ikke :(");
            antallFeil++;
        }

        // Test for pop() med ord i beholder.
        pop = beholder.pop();
        if (pop.equals("godteri")) {
            System.out.println("pop() for ord i liste fungerer!");
        }
        else {
            System.out.println("pop() for ord i liste fungerer ikke :(");
            antallFeil++;
        }

        if (antallFeil == 0) {
            System.out.println("Alt fungerer bra, 0 feil!");
        }
        else if (antallFeil > 0) {
            System.out.println("Programmet har feil: " + antallFeil + "/5 tester feilet.");
        }
    }
}