public class Nedover implements Runnable {
    int tall = Integer.MAX_VALUE;
    Monitor monitor = new Monitor();

    public void run() {
        while (monitor.settStorste(tall)) {
            tall--;
        }
        System.out.println("Tallet er ikke lenger det største av de to: " + tall);
    }
}
