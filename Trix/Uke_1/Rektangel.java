package Uke_1;
class Rektangel {
    public double lengde;
    public double bredde;

    public Rektangel (double l, double b) {  
        lengde = l;
        bredde = b;      
    }

    public void oekLengde (int oekning) {
        lengde += oekning;
    }

    public void oekBredde (int oekning) {
        bredde += oekning;
    }

    public void minskBredde (int minsk) {
        bredde -= minsk;
    }

    public void minskLengde (int minsk) {
        lengde -= minsk;
    }

    public double areal () {
        return bredde*lengde;
    }

    public double omkrets () {
        return (2*bredde) + (2*lengde);
    }

    public static void main (String[] args) {
        Rektangel rektangel1 = new Rektangel(5, 3);
        Rektangel rektangel2 = new Rektangel(2, 6);  

        System.out.println(rektangel1.areal()); //=15
        System.out.println(rektangel2.areal()); //=12

        rektangel1.oekLengde(3); //lengde = 8
        rektangel2.oekBredde(4); //bredde = 10

        System.out.println(rektangel1.omkrets()); //=22
        System.out.println(rektangel2.omkrets()); //=24
    }
}


