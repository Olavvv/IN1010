import java.util.Scanner;
import java.io.File;

public class FraFil {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("tekst.txt"));

        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        scan.close();
        
    }
}
