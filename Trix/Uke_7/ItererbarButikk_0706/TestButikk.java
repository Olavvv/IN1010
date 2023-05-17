public class TestButikk {
    public static void main(String[] args) {
        Butikk butikk = new Butikk();

        Person person1 = new Person("Per", "Egg");
        Person person2 = new Person("Arne", "Brød");
        Person person3 = new Person("Bengt", "Smør");
        Person person4 = new Person("Ole", "Kebab");
        Person person5 = new Person("Kari", "Bok");

        butikk.entreButikk(person1);
        butikk.entreButikk(person2);
        butikk.entreButikk(person3);
        butikk.entreButikk(person4);
        butikk.entreButikk(person5);

        for (Person person : butikk) {
            System.out.println(person);
        }
    }
}
