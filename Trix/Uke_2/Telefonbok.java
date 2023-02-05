import java.util.HashMap;
import java.util.Scanner;

public class Telefonbok {
    public static void main(String[] arg) {
        HashMap<String,String> telefonbok = new HashMap<String,String>();

        telefonbok.put("Arne","22334455");
        telefonbok.put("Lisa","95959595");
        telefonbok.put("Jonas","97959795");
        telefonbok.put("Peder","12345678");

        Scanner in = new Scanner(System.in);

        int status = 0;
        while (status != 1) {
            System.out.println("Meny:\n0: Soek etter person\n1: Avslutt.");
            status = in.nextInt();

            if (status == 0) {
                System.out.print("Hvem vil du ha nummeret til? ");
                String navn = in.next();

               if (telefonbok.containsKey(navn.strip())) {
                System.out.println("Navn: " + navn + ", Tlf: " + telefonbok.get(navn));
               }
               else {
                System.out.println("Fant ikke tlfnr til navn: " + navn);
               }
            }
        }

        System.out.println("Skriver ut navn: ");
        for (String navnekey : telefonbok.keySet()) {
            System.out.println("Navn: " + navnekey + ", Tlf: " + telefonbok.get(navnekey));
        }
    }
}
