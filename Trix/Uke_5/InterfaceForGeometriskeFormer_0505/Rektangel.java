public class Rektangel implements Figur {
    private double lengde;
    private double bredde;

    public Rektangel(double lengde, double bredde) {
        this.lengde = lengde;
        this.bredde = bredde;
    }

    public double beregnAreal() {
        return (lengde*bredde);
    }

    public double beregnOmkrets() {
        return (lengde*2) + (bredde*2); 
    }
}
