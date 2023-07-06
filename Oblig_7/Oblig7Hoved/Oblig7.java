import java.util.Scanner;

public class Oblig7 {
    public static void main(String[] args) {
        String valg = "start";
        int rad, kol;
        Scanner sc = new Scanner(System.in);

        // Sjekker om argumentet er gitt og er på riktig form.
        if (args.length > 1) {
            System.out.println("Bare ett argument skal gis.");
            System.exit(0);
        }
        else if (args.length == 0) {
            System.out.println("Programmet må ha filnavnet til labyrinten som argument.");
            System.exit(0);
        }

        String filnavn = args[0];


        System.out.println("Her er oversikt over labyrinten: \n");
        Labyrint lab = new Labyrint(filnavn);

        // Starter en løkke som spør bruker om startrute,
        // kaller så på finnUtveiFra på den valgte ruten.
        while(true) {
            System.out.println("\n");
            System.out.println("Skriv inn startrute (på formen: <rad>,<kolonne> ): ");
            System.out.println("Skriv inn Avslutt om du vil avslutte programmet.");
            System.out.println("\n");

            valg = sc.nextLine();
            if (valg.equals("Avslutt")) {
                System.out.println("Avslutter programmet");
                System.exit(0);
            }

            else {
                if (!valg.contains(",")) {
                    System.out.println("Koordinatene må være på formen: <rad>,<kolonne>");
                    System.exit(0);
                }
                String [] verdier = valg.split(",");
                rad = Integer.parseInt(verdier[0]);
                kol = Integer.parseInt(verdier[1]);
                System.out.println("Utganger er: ");
                lab.finnUtveiFra(rad, kol);
            }
        }
    }
}
