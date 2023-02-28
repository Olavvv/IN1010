public class Person2 {
    Bil3 personensBil;

    public Person2(Bil3 bilObjekt) {
        personensBil = bilObjekt;
    }

    public void skrivBilNummer() {
        System.out.println(personensBil.hentNummer());
    }


}
