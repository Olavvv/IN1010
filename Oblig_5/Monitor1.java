import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Monitor1 {
    
    protected SubsekvensRegister subRegister = new SubsekvensRegister();

    
    protected Lock threadLock = new ReentrantLock(true);

    public static HashMap<String, Subsekvens> lesFraFil(String filnavn) {
        return SubsekvensRegister.lesFraFil(filnavn);
    }

    public void leggTil(HashMap<String, Subsekvens> hash) {
        // Laaser threaden til metoden er ferdig.
        threadLock.lock();

        // Legger til mappet.
        try {
            subRegister.leggTil(hash);
        }
        // Laaser locken.
        finally {
            threadLock.unlock();
        }
    }


    public HashMap<String, Subsekvens> hentHash(int indeks) {
        HashMap<String, Subsekvens> hash;
        threadLock.lock();
        try {
            hash = subRegister.hentHash(indeks);
        }
        finally {
            threadLock.unlock();
        }
        return hash;
    }

    public HashMap<String, Subsekvens> fjernHash(int indeks) {
        return subRegister.fjernHash(indeks);
    }

    public Subsekvens hentStoerste(int indeks) {
        Subsekvens stoerste;
        threadLock.lock();

        try {
            stoerste = subRegister.hentStoerste(indeks);
        }
        finally{
            threadLock.unlock();
        }
        return stoerste;
    }

    public int size() {
        int antall;
        threadLock.lock();

        try {
            antall = subRegister.size();
        }
        finally {
            threadLock.unlock();
        }
        return antall;
    }

    public void flettAlle() {
        threadLock.lock();
        try {
            subRegister.flettAlle();
        }
        finally {
            threadLock.unlock();
        }
    }

    public String toString() {
        String returnString;

        threadLock.lock();

        try {
            returnString = subRegister.toString();
        }
        finally {
            threadLock.unlock();
        }
        return returnString;
    }
}
