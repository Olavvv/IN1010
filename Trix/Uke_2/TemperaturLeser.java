import java.io.File;
import java.util.Scanner;

public class TemperaturLeser  {
    public static void main(String[] args) throws Exception{
        String[] lines = new String[12];
        Scanner scan = new Scanner(new File("Temperatur.txt"));

        int i = 0;
        while (scan.hasNextLine()) {
            lines[i] = scan.nextLine();
            i++;
        }

        for (int k = 0; k < lines.length; k++) {
            System.out.println(lines[k]);
        }
    }

}
