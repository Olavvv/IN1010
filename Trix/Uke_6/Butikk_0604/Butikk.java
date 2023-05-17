public class Butikk {
    Person forstePerson;

    public void entreButikk(Person person) {
        Person peker = forstePerson;

        if (forstePerson == null) {
            forstePerson = person;
        }
        else {
            while (peker.neste != null) {
                peker = peker.neste;
            }
            peker.neste = person;
        }
    }

    public void kassa() {
        while (forstePerson != null) {
            System.out.println(forstePerson);
            System.out.println("- Hade bra!");
            forstePerson = forstePerson.neste;
        }
    }
}
