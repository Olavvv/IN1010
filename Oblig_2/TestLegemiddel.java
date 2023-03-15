public class TestLegemiddel {

    // Bruker test metoden som ble brukt i Oblig 1 for testfilene
    // Fordi de er ryddige og er oversiktlige 
    public static void test(String hva, Boolean sjekk) {
        if (!sjekk) { System.out.println(hva + " er feil!"); System.exit(1);}
    }

    private static void testLegemiddelId() {
        Narkotisk narkotisk1 = new Narkotisk("Narko", 1500, 50, 5 ); 
        Vanedannende vanedannende1 = new Vanedannende("Vane", 500, 20, 3);
        Vanlig vanlig1 = new Vanlig("Van", 200, 100);

        System.out.println(narkotisk1.id);
        System.out.println(vanedannende1.id);

        test("Id er 0 for første objekt av denne subklassen", narkotisk1.id == 0);
        test("Id er 0 for første objekt av denne subklassen", vanedannende1.id == 1);
        test("Id er 0 for første objekt av denne subklassen", vanlig1.id == 2);

        Narkotisk narkotisk2 = new Narkotisk("ja", 200, 30, 20);
        Vanedannende vanedannende2 = new Vanedannende("vane", 200, 200, 200);
        Vanlig vanlig2 = new Vanlig("van", 200, 200);

        test("Id er 1 for andre objekt av denne subklassen", narkotisk2.id == 3);
        test("Id er 1 for andre objekt av denne subklassen", vanedannende2.id == 4);
        test("Id er 1 for andre objekt av denne subklassen", vanlig2.id == 5);

        System.out.println("Under kommer toString - metoden til de forskjellige klassene, se om alt er riktig: ");
        System.out.println(narkotisk1);
        System.out.println(vanedannende1);
        System.out.println(vanlig1);
        System.out.println(narkotisk2);

    }
        

    public static void main(String[] args) {
        testLegemiddelId();

        System.out.println("Alt er riktig!");
    }   
}
