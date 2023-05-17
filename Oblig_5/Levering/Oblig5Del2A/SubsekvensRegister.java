import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SubsekvensRegister {
    private ArrayList<HashMap<String, Subsekvens>> subsekvenser;

    public SubsekvensRegister() {
        subsekvenser = new ArrayList<HashMap<String, Subsekvens>>();
    }

    public static HashMap<String, Subsekvens> lesFraFil(String filNavn) {

        HashMap<String, Subsekvens> hash = new HashMap<String, Subsekvens>();
        String linje;
        String subsekvens;

        try {
            Scanner sc = new Scanner(new File(filNavn));

            int linjeNummer = 1;
            while (sc.hasNextLine()) {
                linje = sc.nextLine();
                if (linje.length() < 3) {  
                    System.out.println("Linjen er ikke 3 karakterer eller lengre." + " " + linjeNummer + " " + filNavn);
                    System.exit(1);
                }

                // Deler opp linjen i subsekvensene.
                for (int i = 0; i < linje.length() - 2; i++) {
                    subsekvens = linje.substring(i, i+3);

                    // Dersom den ikke eksisterer i hashmappet, blir den lagt til.
                    if (!hash.containsKey(subsekvens)) {
                        hash.put(subsekvens, new Subsekvens(1, subsekvens));
                    }
                }
            }

            sc.close();

        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return hash;
    }

    public static HashMap<String, Subsekvens> flettHashMap(HashMap<String, Subsekvens> hash1, HashMap<String, Subsekvens> hash2) {
        HashMap<String, Subsekvens> flettetHash = new HashMap<String, Subsekvens>();

        // Putter først hele hash1 inn i den tomme flette hashen.
        flettetHash.putAll(hash1);
        for (String key : hash2.keySet()) {
            // Dersom sekvensen ikke eksisterer i flettetHash.
            // Legger vi den til i flettetHash.
            if (!flettetHash.containsKey(key)) {
                flettetHash.put(key, hash2.get(key));
            }
            // Dersom sekvensen eksisterer.
            // Slaar vi sammen antallene til de to like sekvensene.
            else {
                Subsekvens sub1 = flettetHash.get(key);
                Subsekvens sub2 = hash2.get(key);
                sub1.endreAntall(sub1.hentAntall() + sub2.hentAntall());     
            }
        }
        return flettetHash;

    }

    public String toString() {
        String returnString = "";

        for (HashMap<String, Subsekvens> hash : subsekvenser) {
            for (Subsekvens sekvens : hash.values()) {
                returnString += sekvens.toString();
            }
            returnString += "\n";
        }
        return returnString;
    }

    public void leggTil(HashMap<String, Subsekvens> hash) {
        subsekvenser.add(hash);
    }

    public HashMap<String, Subsekvens> hentHash(int indeks) {
        return subsekvenser.get(indeks);
    }

    public HashMap<String, Subsekvens> fjernHash(int indeks) {
        return subsekvenser.remove(indeks);
    }

    public int size() {
        return subsekvenser.size();
    }

    public Subsekvens hentStoerste(int indeks) {
        int stoerste = 0;
        Subsekvens stoersteSubsekvens = null;

        for (Subsekvens sub : subsekvenser.get(indeks).values()) {
            if (sub.hentAntall() > stoerste) {
                stoersteSubsekvens = sub;
                stoerste = sub.hentAntall();
            }
        }
        return stoersteSubsekvens;
    }

    // Skrev denne metoden fordi jeg synes den er kjekk aa ha :).
    public void flettAlle() {
        HashMap<String, Subsekvens> flettet = new HashMap<String, Subsekvens>();

        for (HashMap<String, Subsekvens> hash : subsekvenser) {
            flettet = SubsekvensRegister.flettHashMap(flettet, hash);
        }

        subsekvenser.clear();
        subsekvenser.add(flettet);

    }
}
