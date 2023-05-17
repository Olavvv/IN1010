import java.util.ArrayList;
import java.util.Scanner;

public class Hovedprogram {
    public static void main(String[] args) {
        ArrayList<Kjoretoy> kjoretoy = new ArrayList<Kjoretoy>();
        Scanner sc = new Scanner(System.in);
        String kjoreStatus = "0";

        while (!kjoreStatus.equals("4")) {
            System.out.println("|---------------MENY---------------|");
            System.out.println("|   #1 - Registrer nytt kjøretøy   |");
            System.out.println("|   #2 - Skriv data om kjøretøy    |");
            System.out.println("|   #3 - Sum av årsavgift for eier |");
            System.out.println("|   #4 - Avslutt                   |");
            System.out.println("|----------------------------------|");
            
            kjoreStatus = sc.nextLine();

            // Valg 1.
            if (kjoreStatus.equals("1")) {
                String regNr;
                String fabMrk;
                String eierNvn;
                int nSittePls;
                int maxVekt;

                System.out.println();
                System.out.println("Oppgi registreringsnummer: ");
                System.out.println();
                regNr = sc.nextLine();

                System.out.println();
                System.out.println("Oppgi fabrikkmerke: ");
                System.out.println();
                fabMrk = sc.nextLine();

                System.out.println();
                System.out.println("Oppgi eierens navn: ");
                System.out.println();
                eierNvn = sc.nextLine();

                System.out.println();
                System.out.println("Hva er type kjøretøy du ønsker å opprette? (Personbil, Buss, Varebil)");
                System.out.println();
                String valg = sc.nextLine();
    
                if (valg.equals("Buss")) {
                    System.out.println();
                    System.out.println("Oppgi antall sitteplasser: ");
                    System.out.println();
                    nSittePls = sc.nextInt();

                    kjoretoy.add(new Buss(regNr, fabMrk, eierNvn, nSittePls));
                    System.out.println("Buss lagt til!");
                }
                else if (valg.equals("Personbil")) {
                    System.out.println();
                    System.out.println("Oppgi antall sitteplasser: ");
                    System.out.println();
                    nSittePls = sc.nextInt();

                    kjoretoy.add(new Personbil(regNr, fabMrk, eierNvn, nSittePls));
                    System.out.println("Personbil lagt til!");
                }
                else if (valg.equals("Varebil")) {
                    System.out.println();
                    System.out.println("Oppgi maks lastevekt: ");
                    System.out.println();
                    maxVekt = sc.nextInt();

                    kjoretoy.add(new Varebil(regNr, fabMrk, eierNvn, maxVekt));
                    System.out.println("Varebil lagt til!");
                }
            }

            // Valg 2.
            if (kjoreStatus.equals("2")) {
                if (kjoretoy.size() == 0) {
                    System.out.println("Det er ingen registrerte kjøretøy.");
                }

                String regNr;
                System.out.println();
                System.out.println("Hva er registreringsnummeret til kjøretøyet?");
                System.out.println();

                for (Kjoretoy kjor : kjoretoy) {
                    System.out.println("Eiers navn: " + kjor.eierensNavn + ". RegNr: " + kjor.registreringsNr);
                    System.out.println();
                }

                regNr = sc.nextLine();

                for (Kjoretoy kjor : kjoretoy) {
                    if (kjor.registreringsNr.equals(regNr)) {
                        System.out.println(kjor);
                    }
                }
            }

            // Valg 3.
            if (kjoreStatus.equals("3")) {
                String eierNavn;
                int sum = 0 ;

                System.out.println();
                System.out.println("Hva er eierens navn?");
                System.out.println();
                eierNavn = sc.nextLine();

                for (Kjoretoy kjor : kjoretoy) {
                    if (kjor.eierensNavn.equals(eierNavn)) {
                        sum += kjor.aarsavgift;
                    }
                }

                System.out.println();
                System.out.println("Summen av årsavgift for eier: " + eierNavn + ", er: " + sum);
                System.out.println();
            }
        }
        sc.close();
    }
}
