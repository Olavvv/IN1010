
public class IndeksertListe<E> extends LenkeListe<E> {
    
    public void leggTil(int pos, E x) {
        if (pos > stoerrelse() || pos < 0) {
            throw new UgyldigListeindeks(pos);
        }

        Node nyNode = new Node(x);

        // Dersom listen er tom, oppretter ny node, og setter som start.
        if (start == null) {
            start = nyNode;
        }
        // Om vi vil legge til ved start, setter start til nyNode.
        else if (pos == 0) {
            nyNode.neste = start;
            start = nyNode;

        }
        // Kaller superklassens leggTil metode dersom vi oensker aa legge til element ved slutten.
        else if (pos == stoerrelse()) {
            super.leggTil(x);
        }
        // Ellers loep gjennom listen og finn noden foer indeksen.
        // Setter inn den nye noden slik den faar indeks 'pos'.
        else {
            Node peker = start;
            for (int i = 0; i < pos - 1; i++) {
                peker = peker.neste;
            }
            nyNode.neste = peker.neste;
            peker.neste = nyNode;
        }
        System.out.println("Lagt til: " + x);
    }


    // Finner noden ved 'pos' og erstatter dataen.
    public void sett (int pos, E x) {
        if (pos >= stoerrelse() || pos < 0) {
            throw new UgyldigListeindeks(pos);
        }
        else {
            Node peker = start;
            for (int i = 0; i < pos; i++) {
                peker = peker.neste;
            }
            peker.data = x;
        }
    }


    public E hent(int pos) {
        // Sjekker om pos er en lovlig indeks.
        if (pos >= stoerrelse() || pos < 0) {
            throw new UgyldigListeindeks(pos);
        }

        // Loeper gjennom nodene, returnerer dataen til noden ved pos.
        Node peker = start;
        for (int i = 0; i < pos; i++) {
            peker = peker.neste;
        }
        return peker.data;
    }


    public E fjern(int pos) {
        // Sjekker om pos er en lovlig indeks.
        if (pos >= stoerrelse() || pos < 0) {
            throw new UgyldigListeindeks(pos);
        }

        if (pos == 0) {
            return super.fjern();
        }

        // Loeper gjennom nodene, returnerer dataen til noden ved pos.
        else { 
            Node peker = start;
            for (int i = 0; i < pos - 1; i++) {
                peker = peker.neste;
            }
            E returnData = peker.neste.data;
            peker.neste = peker.neste.neste;
            return returnData;
        }
    }
    
}
