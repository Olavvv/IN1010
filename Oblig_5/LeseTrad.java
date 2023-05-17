import java.io.FileNotFoundException;
import java.util.HashMap;

public class LeseTrad implements Runnable {
    Monitor1 monitor;
    String filnavn;


    public LeseTrad(String filnavn, Monitor1 monitor) {
        this.filnavn = filnavn;
        this.monitor = monitor;
    }

    @Override
    public void run() {
        try {
            HashMap<String, Subsekvens> hash = Monitor1.lesFraFil(filnavn);
            monitor.leggTil(hash);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}
