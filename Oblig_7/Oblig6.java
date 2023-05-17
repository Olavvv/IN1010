public class Oblig6 {
    public static void main(String[] args) {
        if (args.length > 1) {
            System.out.println("Bare ett argument skal gis.");
            System.exit(0);
        }
        else if (args.length == 0) {
            System.out.println("Programmet må ha filnavnet til labyrinten som argument.");
            System.exit(0);
        }

        String filnavn = args[0];

        Labyrint lab = new Labyrint(filnavn);
    }
}
