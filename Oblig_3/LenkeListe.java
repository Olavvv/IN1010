abstract class LenkeListe <E> implements Liste <E> {
    // Node arkitekturen.
    protected class Node {
        // Hver node har referanse til neste noden i lista.
        Node neste = null;
        // Hver node har ogsaa data.
        E data;

        // Konstruktoeren tar inn dataen til noden.
        Node (E x) {
            data = x;
        }
    }
    // Setter start-noden til 'null'.
    protected Node start = null;

    // Skriver ut dataen i lista.
    public String toString() {
        String innhold = "[" + start.data;
        Node peker = start.neste;

        while (peker != null) {
            innhold += ", " + peker.data;
            peker = peker.neste;
        }
        innhold += "]";

        return innhold;
    }

    //Loeper gjennop
    public int stoerrelse() {
        int teller = 0;
        Node peker = start;

        while (peker != null) {
            teller ++;
            peker = peker.neste;
        }
        return teller;
    }


    public void leggTil(E x) {
        // Lager et nytt Node-objekt med data 'x'.
        Node nyNode = new Node(x);

        // Om lista er tom, sett nye noden som start node.
        if (start == null) {
            start = nyNode;
        }
        else {
            // Ellers loope gjennom lista til siste noden.
            // Sett inn nyNode ved slutt.
            Node peker = start;
            while (peker.neste != null) {
                peker = peker.neste;
            }

            // Sett inn nyNode som peker.neste for aa koble sammen lista.
            peker.neste = nyNode;
        }
    }

    // Henter ut start-nodens data.
    public E hent() {
        return start.data;
    }

    public E fjern() {
        // Dersom listen er tom, skal det kastes en 'UgyldigListeindeks' exception
        // Med indeks '-1', som betyr at listen er tom.
        if (start == null) {
            throw new UgyldigListeindeks(-1);
        }
        // Ellers setter start noden til noden etter den opprinnelige start noden
        // Og returnerer dataen til den opprinnelige noden.
        else {
            E startNodeData = start.data;
            start = start.neste;
    
            return startNodeData;
        }
    }
}
