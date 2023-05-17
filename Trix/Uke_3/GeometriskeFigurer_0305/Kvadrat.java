public class Kvadrat extends Figur {
    double lengde;

    public Kvadrat(double lengde) {
        this.lengde = lengde;
    }

    public double areal() {
        return lengde*lengde;
    }
}
