/*
 * HUSK Å TEGN KLASSEHIERARKIET TIL INTERFACE-ENE 
 * OG KLASSENE SOM SKRIVES!!!!!
 */


interface Liste <E> extends Iterable<E> {
    int stoerrelse();
    void leggTil(E x);
    E hent();
    E fjern();
}
