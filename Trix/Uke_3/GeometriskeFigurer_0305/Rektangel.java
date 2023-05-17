public class Rektangel extends Figur {
    double bredde;
    double hoyde;
    
    public Rektangel(double bredde, double hoyde) {
        this.bredde = bredde;
        this.hoyde = hoyde;
    }

    public double areal() {
        return (bredde*hoyde);
    }
}
