public class KvadratStabel {
    class Node {
        Node neste = null;
        Node forrige = null;
        Kvadrat kvadrat;
        Node (Kvadrat kvadrat) {
            this.kvadrat = kvadrat;
        }
    }

    Node start = null;

    public void leggPaa(Kvadrat kvadrat) {
        Node nyNode = new Node(kvadrat);

        if (start == null) {
            start = nyNode;
        }
        else {
            start.forrige = nyNode;
            nyNode.neste = start;
            start = nyNode;
        }
    }

    public Kvadrat taAv() {
        Kvadrat returnKvadrat = start.kvadrat;
        if (start.neste == null) {
            start = null;
            return returnKvadrat;
        }
        start.neste.forrige = null;
        start = start.neste;
        return returnKvadrat;
    }

    public boolean erTom() {
        if (start == null) {
            return true;
        }
        return false; 
    }
}