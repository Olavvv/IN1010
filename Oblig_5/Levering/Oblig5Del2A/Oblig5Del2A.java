import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;

public class Oblig5Del2A {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("Legg in mappenavn som parameter!");
            System.exit(1);
        }
        else if (args.length > 1) {
            System.out.println("Bare skriv inn en parameter til programmet, som skal vaere mappenavnet til testdatafilen");
            System.exit(1);
        }

        String mappe = args[0];
        // Lager et nytt monitor objekt.
        Monitor1 monitor = new Monitor1();
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

        // Med join metoden må man teste for InterruptedException.
        try {
            for (Thread traad : traader) {
                traad.join();
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }


        monitor.flettAlle();
        System.out.println(monitor.size());
        System.out.println(monitor.hentStoerste(0));

        
    }
}
