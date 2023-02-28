public class Integrasjonstest {

    public static void main(String[] args) {
        // Oppretter instanser av hver eneste klasse.
        Vanlig vanlig = new Vanlig("vanlig", 500, 20);
        Vanedannende vanedannende = new Vanedannende("van", 700, 20, 30);
        Narkotisk narkotisk = new Narkotisk("narkotisk", 600, 40, 10);

        Lege lege = new Lege("per");
        Spesialist spesialist = new Spesialist("arne", "938482742");

        BlaaResept blaa = new BlaaResept(narkotisk, lege, 0, 2);
        HvitResept hvit = new HvitResept(vanedannende, spesialist, 2, 3);
        MilResept mil = new MilResept(vanlig, lege, 4);
        PResept presept = new PResept(narkotisk, lege, 4, 2);

        // Skriver ut all relevant info om alle objekt instansene opprettet.
        System.out.println("*** Skriver ut info om Legemidlene ***");
        System.out.println();
        System.out.println(vanlig);
        System.out.println(vanedannende);
        System.out.println(narkotisk);
        System.out.println();

        System.out.println("*** Skriver ut info om Legene ***");
        System.out.println();
        System.out.println(lege);
        System.out.println(spesialist);
        System.out.println();

        System.out.println("*** Skriver ut info om Reseptene ***");
        System.out.println();
        System.out.println(blaa);
        System.out.println(hvit);
        System.out.println(mil);
        System.out.println(presept);
        System.out.println();

        System.out.println("Ferdig!");

    }
    
}
