public class Trekant extends Figur {
    double hoyde;
    double bredde;

    public Trekant(double hoyde, double bredde) {
        this.hoyde = hoyde;
        this.bredde = bredde;
    }

    public double areal() {
        return ((hoyde*bredde)/2);
    }
    
}
