public class TestBeholder {
    public static void main(String[] args) {
        Beholder<Sirkel> sirkelBeholder = new Beholder<Sirkel>();
        Sirkel sirkel = new Sirkel(3);
        Kvadrat kvadrat = new Kvadrat(4);
        sirkelBeholder.settInn(sirkel);

        /*
         * Siden vi har deklarert beholderen til å kun ha sirkler
         * vil vi få feilmelding når vi prøver å putte et kvadrat objekt i beholderen
         * Hvis vi ønsker en beholder for både kvadrat og sirkel objekter
         * kan vi deklarere beholdere som en beholder for figur-objekter
         * siden både kvadrat og sirkel klassene er subklasser av figur klassen.
         */
        //sirkelBeholder.settInn(kvadrat);
    }
}
