public class TestHester {
    public static void main(String[] args) {
        Islandshest islandshest = new Islandshest("Arne", 4);
        EngelskFullblodshest engelskFullblodshest = new EngelskFullblodshest("Ole", 7);
        PasoFino pasofino = new PasoFino("AAAAA", 10);

        islandshest.pass();
        islandshest.toelt();
        engelskFullblodshest.trav();
        pasofino.toelt();
    }
}
