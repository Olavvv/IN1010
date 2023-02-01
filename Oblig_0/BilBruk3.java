public class BilBruk3 {
    public static void main(String[] args) {
        Bil3 personensBil = new Bil3("32189054");
        Person person = new Person(personensBil);

        person.skrivBilNummer();
    }
}
