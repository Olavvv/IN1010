import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Monitor {
    int detMinste, detStorste;
    Lock laas = new ReentrantLock();

    public boolean settMinste(int verdi) {
        laas.lock();
        try {
            if (verdi < detStorste) {
                detMinste = verdi;
                return true;
            }
            return false;
        } finally {
            laas.unlock();
        }
        }

    public boolean settStorste(int verdi) {
        laas.lock();
        try {
            if (verdi > detMinste) {
                detStorste = verdi;
                return true;
            }
            return false;
        } finally {
            laas.unlock();
        }
    }
}