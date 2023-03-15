public class Stabel<E> extends LenkeListe<E> {
    
    @Override
    public void leggTil(E x) {

        // Oppretter en ny node, med data 'x'.
        Node nyNode = new Node(x);

        // Om listen er tom, sett den nye noden som start node.
        if (start == null) {
            start = nyNode;
        }
        // Ellers sett den nye nodens neste-referanse til den opprinnelige start noden.
        // Deretter sett start noden til den nye noden.
        else {
            nyNode.neste = start;
            start = nyNode;
        }
    }
}
