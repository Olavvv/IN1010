public abstract class Resept {
    Legemiddel legemiddel;
    Lege utskrivendeLege;
    int pasientId;
    int reit;

    public Resept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        this.legemiddel = legemiddel;
        this.utskrivendeLege = utskrivendeLege;
        this.pasientId = pasientId;
        this.reit = reit;
    }

    public String toString() {
        return " Legemiddel: " + legemiddel + ". Utskrivende lege: " + utskrivendeLege + 
            ". Pasient ID: " + pasientId + ". Reit: " + reit;
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
        return pasientId;
    }

    public int hentReit() {
        return reit;
    }
    
}
