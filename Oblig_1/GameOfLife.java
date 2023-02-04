import java.util.Scanner;

public class GameOfLife {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        char status = 'Y';

        // Spoer bruker om stoerrelse på verdenen.
        System.out.print("Skriv inn antall rader oensket: ");
        int rad = in.nextInt();
        System.out.print("Skriv inn antall kolonner oensket: ");
        int kol = in.nextInt();



        Verden verden = new Verden(rad, kol);

        // Kjoerer saa lenge bruker vil det.
        while (status == 'Y' || status == 'y') {
            verden.tegn();
            verden.oppdatering();

            System.out.print("Fortsette til neste generasjon? (Y/N): ");
            status = in.next().charAt(0);
        }

        System.out.println("Program stoppet.");

        in.close();
    }
}
