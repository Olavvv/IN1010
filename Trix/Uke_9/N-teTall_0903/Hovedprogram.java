import java.util.concurrent.*;
import java.lang.Thread;

public class Hovedprogram {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new NteTall(i, 0, 100)).start();
        }
    }
}
