public class Prioritetskoe<E extends Comparable<E>> extends LenkeListe<E> {

    @Override
    public void leggTil(E x) {

        Node nyNode = new Node(x);

        // Om listen er tom.
        if (start == null) {
            super.leggTil(x);
            return;
        }

        // Om lista er av stoerrelse 1.
        // (Fikk en del problemer om jeg ikke hadde med denne testen.)
        if (stoerrelse() == 1) {
            if ((start.data).compareTo(x) <= 0) {
                super.leggTil(x);
            }

            else {
                nyNode.neste = start;
                start = nyNode;
            }

            }
        else if (stoerrelse() > 1) {

            Node peker = start;
            Node forrige = start;
            for (int i = 0; i < stoerrelse(); i++) {

                // Sjekker om vi er paa slutten av lista.
                if (peker.neste == null) {
                    peker.neste = nyNode;
                    return;
                }

                // Om peker.data er mindre enn x, oppdater peker.
                if ((peker.data).compareTo(x) < 0) {

                    // Oppdaterer forrige én iterasjon senere enn peker.
                    if (i >= 1) {forrige = forrige.neste;}
                    peker = peker.neste;
                }

                // Om noden data er lik x, plasserer vi noden med x etter peker.
                else if ((peker.data).compareTo(x) == 0) {
                    nyNode.neste = peker.neste;
                    peker.neste = nyNode;
                    return;
                }

                // Om peker.data er stoerre enn x, legg x inn foer peker. 
                else if ((peker.data).compareTo(x) > 0){

                    // Sjekker om vi sammenligner med start.
                    if ((start.data).compareTo(x) > 0) {
                        nyNode.neste = start;
                        start = nyNode;
                        return;
                    }
                    // Om vi ikke er ved start, plasser nyNode mellom forrige og neste node.
                    else {
                        forrige.neste = nyNode;
                        nyNode.neste = peker;
                        return;
                    }
                }
            }
        }
    }
}
