import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CDSamling {
    public static void main(String[] args) {
        if (args.length > 1) {
            System.out.println("Bare ett argument!");
            System.exit(0);
        }
        SortertArrayList<CDAlbum> sorterteAlbum = new SortertArrayList<CDAlbum>();
        String filnavn = args[0];
        
        try {
            Scanner sc = new Scanner(new File(filnavn));

            while (sc.hasNextLine()) {
                String[] line = sc.nextLine().split(",");
                String artistNavn = line[0];
                String albumNavn = line[1];
                int utgivelsesAar = Integer.parseInt(line[2].strip());

                sorterteAlbum.settInn(new CDAlbum(artistNavn, albumNavn, utgivelsesAar));

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < sorterteAlbum.storrelse(); i++) {
            System.out.println(sorterteAlbum.hentUtForste());
        }
        
    }
}
