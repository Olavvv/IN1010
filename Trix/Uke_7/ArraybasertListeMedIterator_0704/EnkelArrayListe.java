import java.util.Iterator;

public class EnkelArrayListe implements Iterable<String>{
    private String[] stringArray;
    private int maksStorrelse;
    private int storrelse = 0;

    public EnkelArrayListe(int maksStorrelse) {
        this.maksStorrelse = maksStorrelse;
        stringArray = new String[maksStorrelse];
    }

    public void leggTil(String nyString) {
        if (storrelse >= maksStorrelse) {
            throw new IllegalStateException("Ikke plass til flere strings");
        }
        stringArray[storrelse] = nyString;
        storrelse++;
    }

    public Iterator<String> iterator() {
        return new ListeIterator();
    }

    private class ListeIterator implements Iterator<String> {
        private int indeks = 0;

        public String next() {
            indeks++;
            return stringArray[indeks - 1];
        }

        public boolean hasNext() {
            return indeks < storrelse;
        }
    }
}