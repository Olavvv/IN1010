import java.io.File;
import java.util.*;

public class Skattekart {
    char[] charArray;
    boolean skattFunnet;
    int hoyde, bredde;    

    private Skattekart(char[] charArray, int hoyde, int bredde) {
        this.charArray = charArray;
        this.bredde = bredde;
        this.hoyde = hoyde;

        skattFunnet = false;
    }

    static Skattejakt lesInn(File f) {
        int hoyde, bredde;
        Scanner fileScanner = new Scanner(f);

        hoyde = Integer.parseInt(fileScanner.nextLine().split(" ")[0]);
        bredde = Integer.parseInt(fileScanner.)
    }
}