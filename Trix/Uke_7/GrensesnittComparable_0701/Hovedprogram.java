import java.util.ArrayList;

public class Hovedprogram {
    public static void main(String[] args) {
        ArrayList<Katt> kattArray = new ArrayList<Katt>();

        Katt katt1 = new Katt("b", 4);
        Katt katt2 = new Katt("yngre", 2);
        Katt katt3 = new Katt("samme alder", 4);
        Katt katt4 = new Katt("eldre", 6);

        kattArray.add(katt1);
        kattArray.add(katt2);
        kattArray.add(katt3);
        kattArray.add(katt4);

        Katt eldsteKatt = kattArray.get(0);

        for (Katt katt : kattArray) {
            if (katt.compareTo(eldsteKatt) > 0) {
                eldsteKatt = katt;
            }
        }

        System.out.println(eldsteKatt);
    }
}
