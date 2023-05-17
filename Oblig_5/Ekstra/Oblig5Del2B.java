import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;

public class Oblig5Del2B {
    public static void main(String[] args) throws FileNotFoundException {

        // Sjekker om argumentet ved kjøring er riktig.
        if (args.length < 1) {
            System.out.println("Legg in mappenavn som parameter!");
            System.exit(1);
        }
        else if (args.length > 1) {
            System.out.println("Bare skriv inn en parameter til programmet, som skal vaere mappenavnet til testdatafilen");
            System.exit(1);
        }

        // Mappen filen er lagret i, er første argument fra bruker.
        String mappe = args[0];
        // Lager et nytt monitor objekt.
        Monitor2 monitor = new Monitor2();
        // Lager en arraylist for å ta vare på tråder.
        ArrayList<Thread> traader = new ArrayList<Thread>();


        String metaPath = mappe + "/metadata.csv";
        Scanner dataScanner = new Scanner(new File(metaPath));

        while (dataScanner.hasNextLine()) {
            String fil = dataScanner.nextLine();
            String filPath = mappe + "/" + fil;

            // Lager en ny tråd som bruker LeseTrad klassen.
            Thread nyTraad = new Thread(new LeseTrad(filPath, monitor));
            traader.add(nyTraad);
            nyTraad.start();
        }

        // Join metoden venter på at tråden "dør".
        try {
            for (Thread traad : traader) {
                traad.join();
            }
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        // Oppretter en ny arraylist som tar vare på alle trådene 
        // som blir laget for å flette hasmappene
        ArrayList<Thread> fletteTraader = new ArrayList<Thread>();

        // Oppretter 4 tråder for å flette hashmaps.
        for (int i = 0; i < 4; i++) {
            Thread fletteTraad = new Thread(new FletteTrad(monitor));
            fletteTraader.add(fletteTraad);
            fletteTraad.start();
        }

        // Venter her på at alle trådene skal fullføre.
        try {
            for (Thread traad : fletteTraader) {
                traad.join();
            }
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(monitor.size());
        System.out.println(monitor.hentStoerste(0));
    }
}
