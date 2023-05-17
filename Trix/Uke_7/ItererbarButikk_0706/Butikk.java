import java.util.Iterator;

public class Butikk implements Iterable<Person>{
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

    private class PersonIterator implements Iterator<Person> {
        Person peker = forstePerson;

        public boolean hasNext() {
            if (peker != null) {
                return true;
            }
            return false;
        }

        public Person next() {
            Person returnPerson = peker;
            peker = peker.neste;
            return returnPerson;
        }
    }

    public Iterator<Person> iterator() {
        return new PersonIterator();
    }
}
