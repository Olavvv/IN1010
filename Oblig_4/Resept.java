public abstract class Resept {
    Legemiddel legemiddel;
    Lege utskrivendeLege;
    Pasient pasient;
    int reit;

    public final int id;
    public static int idNr = 0;

    public Resept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient, int reit) {
        this.legemiddel = legemiddel;
        this.utskrivendeLege = utskrivendeLege;
        this.pasient = pasient;
        this.reit = reit;

        id = idNr;
        idNr++;
    }

    public String toString() {
        return " Legemiddel: " + legemiddel + ". Utskrivende lege: " + utskrivendeLege + 
            ". Pasient ID: " + pasient.id + ". Reit: " + reit;
    }

    // Henter ID til legemiddeled referert i resept objektet.
    public int returnId() {
        if (legemiddel instanceof Vanlig) {
            return ((Vanlig) legemiddel).id;
        }
        
        else if (legemiddel instanceof Vanedannende) {
            return ((Vanedannende) legemiddel).id;
        }

        else if (legemiddel instanceof Narkotisk) {
            return ((Narkotisk) legemiddel).id;
        }
        else return 1000;
    }

    // Forsoker aa bruke resepten.
    public boolean bruk() {
        if (reit > 0) {
            reit -= 1;
            return true;
        }
        else {
            return false;
        }
    }

    // Defineres videre i subklassene.
    abstract public String farge();
    abstract public int prisAaBetale();


    public Legemiddel hentLegemiddel() {
        return legemiddel;
    }

    public Lege hentLege() {
        return utskrivendeLege;
    }

    public int hentPasientId() {
        return pasient.id;
    }

    public int hentReit() {
        return reit;
    }
    
}
