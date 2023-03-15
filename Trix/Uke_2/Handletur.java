import java.util.Scanner;

public class Handletur {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int broed;
        int melk;
        int ost;
        int youghurt;
        int sum;
        System.out.println("Hvor mange broed vil du ha? ");
        broed = Integer.parseInt(scan.nextLine());
        System.out.println("Hvor mange melk vil du ha? ");
        melk = Integer.parseInt(scan.nextLine());
        System.out.println("Hvor mange ost vil du ha? ");
        ost = Integer.parseInt(scan.nextLine());
        System.out.println("Hvor mange youghurt vil du ha? ");
        youghurt = Integer.parseInt(scan.nextLine());

        sum = (broed*20) + (melk*15) + (ost*40) + (youghurt*12);
        System.out.println("Du skal betale: " + sum);



    }
    
}
