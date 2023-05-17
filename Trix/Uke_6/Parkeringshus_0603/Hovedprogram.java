public class Hovedprogram {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Bil bil1 = new Bil("123", 4);
        Bil bil2 = new Bil("456", 8);
        Bil bil3 = new Bil("789", 2);
        Motorsykkel mot1 = new Motorsykkel("321", 400);
        Motorsykkel mot2 = new Motorsykkel("654", 100);
        Motorsykkel mot3 = new Motorsykkel("987", 1000);

        Parkeringshus parkeringshus = new Parkeringshus();

        parkeringshus.etasje1[4] = new Parkeringsplass<Bil>();
        parkeringshus.etasje1[4].parker(bil1);
    }
}
