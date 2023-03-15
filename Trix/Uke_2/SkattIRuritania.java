import java.util.Scanner;

public class SkattIRuritania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Hva er din inntekt? ");
        float inntekt = scan.nextInt();

        if (inntekt < 10000) {
            System.out.println("Din skatt er: " + (inntekt * 0.1));
        }
        else if (inntekt >= 10000) {
            System.out.println("Din skatt er: " + ((10000*0.1) + ((inntekt - 10000)*0.3)) );
        }
        scan.close();
    }
}
