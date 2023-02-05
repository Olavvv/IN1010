import java.util.Scanner;

import java.util.Scanner;

public class MindreStorre {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Skriv inn et tall: ");

        int a = in.nextInt();
        System.out.println(a);

        if (a < 10) {
            System.out.println("Tallet er mindre enn 10");
        }
        else if (a >= 10 && a <= 20) {
            System.out.println("Tallet er mellom 10 og 20");
        }
        else {
            System.out.println("Tallet er stoerre enn 20");
        }
        in.close();

    }
}
