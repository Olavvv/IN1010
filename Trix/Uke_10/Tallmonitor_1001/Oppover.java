public class Oppover implements Runnable {
    int tall = Integer.MIN_VALUE;
    Monitor monitor = new Monitor();

    public void run() {
        while (monitor.settMinste(tall)) {
            tall++;
        }
        System.out.println("Tallet er ikke lenger det minste: " + tall);
    }
}
