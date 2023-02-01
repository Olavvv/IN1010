public class Person {
    private Bil3 personensBil;

    public Person(Bil3 bilObjekt) {
        personensBil = bilObjekt;
    }

    public void skrivBilNummer() {
        System.out.println(personensBil.hentNummer());
    }


}
