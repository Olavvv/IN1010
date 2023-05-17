import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;

public class Oblig5Del1 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Legg in mappenavn som parameter!");
            System.exit(1);
        }
        else if (args.length > 1) {
            System.out.println("Bare skriv inn en parameter til programmet, som skal vaere mappenavnet til testdatafilen");
            System.exit(1);
        }

        String mappe = args[0];
        SubsekvensRegister subRegister = new SubsekvensRegister();

        try {
            String metaPath = mappe + "/metadata.csv";
            Scanner dataScanner = new Scanner(new File(metaPath));

            while (dataScanner.hasNextLine()) {
                String fil = dataScanner.nextLine();
                String filPath = mappe + "/" + fil;

                HashMap<String, Subsekvens> filHashMap = SubsekvensRegister.lesFraFil(filPath);
                subRegister.leggTil(filHashMap);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Fil er ikke fundet.");
            System.exit(1);
        }

        subRegister.flettAlle();
        System.out.println(subRegister.size());
        System.out.println(subRegister.hentStoerste(0));

        
    }
}
