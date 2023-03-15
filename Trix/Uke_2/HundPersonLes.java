import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class HundPersonLes {

    public static void main(String arg) throws Exception{
        ArrayList<Person3> personer = new ArrayList<Person3>();
        ArrayList<Hund> hunder = new ArrayList<Hund>();

        Scanner scan = new Scanner(new File("hundpersoner.txt"));

        while (scan.hasNextLine()) {
            if (scan.nextLine().split(" ")[0].equals("H")) {
                hunder.add(new Hund(scan.nextLine().split(" ")[1]));
            }
            else if (scan.nextLine().split(" ")[0].equals("P")) {
                personer.add(new Person3(scan.nextLine().split(" ")[1]));
            }
        }
        scan.close();
    }
    
}
