import java.util.Iterator;

public class TestEnkelArrayListe {
    public static void main(String[] args) {
        EnkelArrayListe arrayListe = new EnkelArrayListe(10);

        for (int i = 0; i < 10; i++) {
            arrayListe.leggTil("String " + i);
        }

        for (String element : arrayListe) {
            System.out.println(element);
        }

        System.out.println("Tester eksplisitte kall på iterator:");
        Iterator<String> iter = arrayListe.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
