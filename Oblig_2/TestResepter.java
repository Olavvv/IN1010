public class TestResepter {

    private static void test(String hva, Boolean sjekk) {
        if (!sjekk) { System.out.println(hva + "er feil!"); System.exit(1);}
    }
    
    private static void testRes() {
        Narkotisk nark1 = new Narkotisk("nar", 1500, 20, 20);
        Vanedannende van1 = new Vanedannende("van", 1000, 10, 20);
        Vanlig vanl1 = new Vanlig("vanl", 2000, 15);
        Narkotisk nark2 = new Narkotisk("nark2", 300, 10, 20);

        Lege leg = new Lege("per");

        MilResept mil = new MilResept(vanl1, leg, 0);
        PResept presept = new PResept(van1, leg, 0, 2);
        BlaaResept blaa = new BlaaResept(nark1, leg, 0, 1);
        BlaaResept blaa2 = new BlaaResept(nark2, leg, 0, 3);

        // Tester om prisene er riktig.
        test("Riktig pris på militærresept",mil.prisAaBetale() == 0);
        test("Riktig pris på p-resept", presept.prisAaBetale() == (1000-108));
        test("Riktig pris på blaaresept", blaa.prisAaBetale() == 375);

        test("Metode returnId fungerer", mil.returnId() == 0);
        test("Metode returnId fungerer", presept.returnId() == 0);
        test("Metode returnId fungerer", blaa.returnId() == 0);
        test("Metode returnId fungerer", blaa2.returnId() == 1);

        //Sjekker reit på alle objektene, så bruker jeg objektene og sjekker reit igjen.
        test("riktig reit", mil.hentReit() == 3);
        test("riktig reit", presept.hentReit() == 2);
        test("riktig reit", blaa.hentReit() == 1);
        mil.bruk();
        presept.bruk();
        blaa.bruk();
        test("riktig reit", mil.hentReit() == 2);
        test("riktig reit", presept.hentReit() == 1);
        test("riktig reit", blaa.hentReit() == 0);

        //Tester riktig farge
        test("riktig farge", mil.farge() == "hvit");
        test("riktig farge", presept.farge() == "hvit");
        test("riktig farge", blaa.farge() == "blaa");
    }

    public static void main(String[] args) {
        System.out.println("Tester Resept klassene og subklassene");

        testRes();

        System.out.println("Alt fungerer!");
    }

}
