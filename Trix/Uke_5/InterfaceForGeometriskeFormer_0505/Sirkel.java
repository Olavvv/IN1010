public class Sirkel implements Figur {
    private double radius;

    public Sirkel(double radius) {
        this.radius = radius;
    }

    public double beregnAreal() {
        return (Math.PI*radius*radius);
    }

    public double beregnOmkrets() {
        return (Math.PI * 2 * radius);
    }
}
