public class Hovedprogram {
    public static void main(String[] args) {
        Skyskraper sky = new Skyskraper(1,2);
    }
}

/*
 * a)
 * Skyskraper konstruktøren vil automatisk kalle superklassens konstruktør.
 * b)
 * Samme som i a, bare at vi nå kaller super konstruktøren selv.
 * c)
 * Må legge til bruttoAreal inn i super() kallet i Skyskraper konstruktøren.
 */
