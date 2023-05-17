public class KlasseABTestProgram {
    public static void main(String[] args) {
        KlasseB b = new KlasseB();
        KlasseA a = b;

        b.skrivKlasse();
        a.skrivKlasse();
    }
}

/*
 * a)
 * Siden pekeren a peker på et KlasseB objekt,
 * vil den bruke metoden fra KlasseB
 * 
 * 
 * b)
 * Nå får vi en feil, 
 * fordi selv om vi ville ha brukt B-klassens implementasjon 
 * gjør det at vi kaller på metoden fra en A-referanse at vi 
 * forventer en skrivKlasse i A.
 * 
 * c)
 * Nå vil både b og a skrive ut "A", siden b fortsatt har metoden
 * fra superklassen sin som er KlasseA.
 */