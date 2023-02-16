import java.util.ArrayList;
import java.util.HashMap;

public class Telefonbok1 {
    public static void main(String[] arg) {

        // Initializes 3 instances of Person class.
        Person pers0 = new Person("Per", "11234567", "Oslo");
        Person pers1 = new Person("Arne", "82567574", "Trondheim");
        Person pers2 = new Person("Rolf", "94781323", "Bergen");
        
        /* OPPGAVE B
        // Creates array of type Person, 10 spaces.
        // Places the 3 instances in array.
        Person[] personer = new Person[10];
        personer[0] = pers0;
        personer[1] = pers1;
        personer[2] = pers2;

        // Iterates through objects in 'personer' array.
        // If not nullObject -> Invokes .skrivInfo() - method for object in array.
        for (int i = 0; i < personer.length; i++) {
            if (personer[i] != null) {
                pers.skrivInfo();
            }
        }
        */

        /* OPPGAVE C 
        // Create ArrayList, place personer in arraylist.
        ArrayList<Person> personer = new ArrayList<Person>();
        personer.add(pers0);
        personer.add(pers1);
        personer.add(pers2);

        // 'for each' loop to run through each object in ArrayList.
        // If not null, invoke skrivInfo() method.
        for (Person pers : personer) {
            pers.skrivInfo();
        }
        */

        // OPPGAVE D
        // Create HashMap, key-String, content-Person. 
        HashMap<String, Person> personer = new HashMap<String, Person>();
        personer.put(pers0.hentNavn(), pers0);
        personer.put(pers1.hentNavn(), pers1);
        personer.put(pers2.hentNavn(), pers2);

        for (String navn : personer.keySet()) {
            personer.get(navn).skrivInfo();
        }

    }
}
