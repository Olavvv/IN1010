public class FletteTrad implements Runnable {
    private Monitor2 monitor;

    public FletteTrad(Monitor2 monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        while (monitor.size() > 1) {
           monitor.flettHashMap();
        }
    }

}
