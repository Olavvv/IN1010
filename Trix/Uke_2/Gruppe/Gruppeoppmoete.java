import java.util.Scanner;
import java.io.File;

public class Gruppeoppmoete {
    private String[] navn = new String[17];
    private boolean[] oppmoete = new boolean[17];

    public void lesFraFil() throws Exception {
        Scanner scan = new Scanner(new File("gruppeliste.txt"));
        int counter = 0;
        while (scan.hasNextLine()) {
            navn[counter] = scan.nextLine();
            counter++;
        }
        scan.close();
    }

    public void registrerOppmoete(String person) {
        for (int i = 0; i < oppmoete.length; i++) {
            if (person.equals(navn[i])) {
                oppmoete[i] = true;
            }
        }
    }

    public void skrivUt() {
        for (int i = 0; i < navn.length; i++) {
            if (oppmoete[i]) {
                System.out.println("Navn: " + navn[i] + " har moett opp!");            
            }
            else {
                System.out.println("Navn: " + navn[i] + " har ikke moett opp :(");
            }
        }
   }
}
