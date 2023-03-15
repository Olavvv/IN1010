import java.util.Scanner;
import java.io.File;

public class Linjenummer {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("lille_lamb.txt")); 
        
        int counter = 1;
        while (scan.hasNextLine()) {
            System.out.println("# " + counter + ": " + scan.nextLine());
            counter++;
        }
        scan.close();
    }
}
