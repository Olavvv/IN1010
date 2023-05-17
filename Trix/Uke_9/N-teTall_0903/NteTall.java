public class NteTall implements Runnable {
    private final int n, start, maks;
    Monitor monitor = new Monitor();

    public NteTall(int n, int start, int maks) {
        this.n = n;
        this.start = start;
        this.maks = maks;
    }

    public void run() {
        for (int i = start; i <= maks; i++) {
            if (i % 10 == n) {
                monitor.skrivUtTall(i);
            }
        }
    }
}