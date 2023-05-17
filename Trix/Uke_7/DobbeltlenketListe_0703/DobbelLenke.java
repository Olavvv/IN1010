public class DobbelLenke<T> {
    private class Node {
        Node neste = null;
        Node forrige = null;
        T data;

        Node (T data) {
            this.data = data;
        }
    }

    public Node start;

    public void settInn(T data) {
        Node nyNode = new Node(data);

        if (start == null) {
            start = nyNode;
        }
        else {
            Node peker = start;
            while (peker.neste != null) {
                peker = peker.neste;
            }
            nyNode.forrige = peker;
            peker.neste = nyNode;
        }
    }
}