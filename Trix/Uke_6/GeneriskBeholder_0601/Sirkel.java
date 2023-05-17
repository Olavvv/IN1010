public class Sirkel extends Figur {
    double radius;

    public Sirkel(double radius) {
        this.radius = radius;
    }

    public double areal() {
        return Math.PI*radius*radius;
    }
}
