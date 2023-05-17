public class TestMonitor {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        Thread traad1 = new Thread(new Nedover());
        Thread traad2 = new Thread(new Oppover());
        traad1.start();
        traad2.start();
    }
}
