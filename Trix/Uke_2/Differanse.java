import java.util.Scanner;

class Differanse
{
        public static void main(String[] args)
    {
        int keyboard1;
        int keyboard2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv inn tall 1: ");
        keyboard1 = scan.nextInt();

        System.out.println("Skriv inn tall 2: ");
        keyboard2 = scan.nextInt();

        System.out.println("Summen av tallene: " + (keyboard1 + keyboard2));

        scan.close();
    }
}