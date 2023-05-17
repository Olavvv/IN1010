import java.util.HashMap;

public class Monitor2 extends Monitor1 {
    public void flettHashMap() {
        threadLock.lock();

        HashMap<String, Subsekvens> hash1;
        HashMap<String, Subsekvens> hash2;

        try {
            // Dersom det er mindre enn 2 hasmaps, vent på signal.
            if (this.size() < 2) {
                threadLock.unlock();
                return;
            }

            hash1 = this.fjernHash(0);
            hash2 = this.fjernHash(0);
        }
        finally {
            threadLock.unlock();
        }

        HashMap<String,Subsekvens> flettet = SubsekvensRegister.flettHashMap(hash1, hash2);

        this.leggTil(flettet);
    }
}
