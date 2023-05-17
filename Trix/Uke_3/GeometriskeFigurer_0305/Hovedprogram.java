public class Hovedprogram {
    public static void main(String[] args) {
        Trekant trekant = new Trekant(2, 3);
        Sirkel sirkel = new Sirkel(3);
        Rektangel rektangel = new Rektangel(3, 7);
        Kvadrat kvadrat = new Kvadrat(4);

        System.out.println(trekant.areal() + sirkel.areal() + rektangel.areal() + kvadrat.areal());
    }
}
