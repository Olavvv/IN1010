import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Labyrint {
    public Rute[][] ruter;
    public int rader;
    public int kolonner;

    public Labyrint(String filnavn) {
        String line;
        int radTeller = 0;

        if (!filnavn.contains(".in")) {
            System.out.println("Filen er av feil filformat, må være .in");
            System.exit(0);
        }

        try {
            Scanner sc = new Scanner(new File(filnavn));

            line = sc.nextLine();
            rader = Integer.parseInt(line.split(" ")[0]);
            kolonner = Integer.parseInt(line.split(" ")[1]);
            System.out.println(rader + " " + kolonner);

            ruter = new Rute[rader][kolonner];

            while (sc.hasNext()) {
                line = sc.nextLine();
                System.out.println(line);

                for (int i = 0; i < kolonner; i++) {
                    if (line.charAt(i) == '.') {
                        System.out.println(i + " " + radTeller);
                        ruter[radTeller][i] = new HvitRute();
                    }
                    else if (line.charAt(i) == '#') {
                        System.out.println(i + " " + radTeller);
                        ruter[radTeller][i] = new SvartRute();
                    }
                }
                radTeller++;
            }


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        System.out.println(this);

        kobleRuter();
    }

    // Skriver ut labyrinten med riktige symboler.
    public String toString() {
        String output = "";

        for (int rad = 0; rad < rader; rad++) {
            for (int kol = 0; kol < kolonner; kol++) {
                output += ruter[rad][kol].toString();
            }
            output += "\n";
        }

        return output;
    }

    // Metode for å sette opp nord, syd, vest og øst pekerne i hver rute.
    public void kobleRuter() {

        for (int rad = 0; rad < rader; rad++) {
            for (int kol = 0; kol < kolonner; kol++) {

                if (!((rad - 1) < 0) && !((rad + 1) > (rader - 1)) && 
                !((kol - 1) < 0) && !((kol + 1) > (kolonner - 1))) {

                    ruter[rad][kol].nord = ruter[rad-1][kol];
                    ruter[rad][kol].syd = ruter[rad+1][kol];
                    ruter[rad][kol].vest = ruter[rad][kol-1];
                    ruter[rad][kol].oest = ruter[rad][kol+1];
                }
                
            }
        }
    }
}