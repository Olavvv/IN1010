import java.util.Scanner;

public class Produkt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Skriv inn tall 1: ");
        int key1 = sc.nextInt();

        System.out.println("Skriv inn tall 2: ");
        int key2 = sc.nextInt();

        System.out.println("Produktet av de to tallene er: " + (key1 * key2));

        sc.close();

        if (key1 - key2 < 0 || key1 - key2 < 0) {
            System.out.println("Differansen mellom første og andre input er negativ.");
        }
    }
}
