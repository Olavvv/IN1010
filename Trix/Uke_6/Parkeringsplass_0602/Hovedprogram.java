public class Hovedprogram {
    public static void main(String[] args) {
        Parkeringsplass<Bil> bilParkering = new Parkeringsplass<Bil>();
        Parkeringsplass<Motorsykkel> motorsykkelParkering = new Parkeringsplass<Motorsykkel>();
        Motorsykkel motorsykkel = new Motorsykkel("789", 42);
        Bil bil = new Bil("123", 4);

        bilParkering.parker(bil);
        motorsykkelParkering.parker(motorsykkel);
        System.out.println("Bil parkert i bilparkering: " + bilParkering.parkertKjoretoy.registreringsNummer);
        System.out.println("Motorsykkel parkert i motorsykkelparkering: " + motorsykkelParkering.parkertKjoretoy.registreringsNummer);
        
    }
}
