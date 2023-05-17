public class GeneriskStabel<E> {
    protected class Node {
        E data;
        Node neste = null;
        Node forrige = null;

        Node(E data) {
            this.data = data;
        }
    }

    Node start = null;

    public void leggPaa(E data) {
        Node nyNode = new Node(data);

        if (start == null) {
            start = nyNode;
        }
        else {
            start.forrige = nyNode;
            nyNode.neste = start;
            start = nyNode;
        }
    }

    public E taAv() {
        E returnData = start.data;
        if (start.neste == null) {
            start = null;
            return returnData;
        }
        start.neste.forrige = null;
        start = start.neste;
        return returnData;
    }

    public boolean erTom() {
        if (start == null) {
            return true;
        }
        return false; 
    }
}
