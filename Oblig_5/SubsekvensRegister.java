import java.io.File;
import java.util.*;

public class SubsekvensRegister {
    private ArrayList<HashMap<String, Subsekvens>> subsekvenser;

    public SubsekvensRegister() {
        subsekvenser = new ArrayList<HashMap<String, Subsekvens>>();
    }

    public static HashMap<String, Subsekvens> lesFraFil(String filNavn) throws Exception {

        HashMap<String, Subsekvens> hash = new HashMap<String, Subsekvens>();
        Scanner sc = new Scanner(new File(filNavn));
        String linje;
        String subsekvens;

        while (sc.hasNext()) {
            linje = sc.nextLine().trim();
            for (int i = 0; i + 3 < linje.length(); i++) {
                subsekvens = linje.substring(i, i + 3);
                hash.put(subsekvens, new Subsekvens(1, subsekvens));
            }
        }

        return hash;

    }

    public void leggTil(HashMap<String, Subsekvens> hash) {
        subsekvenser.add(hash);
    }

    public void fjernHash(int indeks) {
        subsekvenser.remove(indeks);
    }

    public HashMap<String, Subsekvens> hentHash(int indeks) {
        return subsekvenser.get(indeks);
    }

    public int size() {
        return subsekvenser.size();
    }
}
