import java.io.File;
import java.util.Scanner;

public class Legesystem {
    private static IndeksertListe<Pasient> pasienter = new IndeksertListe<Pasient>();
    private static IndeksertListe<Legemiddel> legemidler = new IndeksertListe<Legemiddel>();
    private static Prioritetskoe<Lege> leger = new Prioritetskoe<Lege>();
    private static IndeksertListe<Resept> resepter = new IndeksertListe<Resept>();


    public void meny() {
        String input = "";
        do{
            System.out.println("");
            System.out.println("+-----------MENY-----------+");
            System.out.println("+--------------------------+");
            System.out.println("#1: Skriv ut oversikt");
            System.out.println("+--------------------------+");
            System.out.println("#2: Legg til nytt element");
            System.out.println("+--------------------------+");
            System.out.println("#3: Bruk resept");
            System.out.println("+--------------------------+");
            System.out.println("#4: Statistikk");
            System.out.println("+--------------------------+");
            System.out.println("#5: Avslutt");
            System.out.println("+--------------------------+");
        
            Scanner brukerInput = new Scanner(System.in);
            input = brukerInput.nextLine();

            switch(input) {
                case "1":
                    skrivUt();
                    break;
                
                case "2":
                    leggTil();
                    break;
                
                case "3":
                    brukResept();
                    break;
                
                case "4":
                    hentStatistikk();
                    break;
                
                case "5":
                    System.out.println("Avslutter programmet.");
                    System.exit(0);
                
                default:
                    System.out.println("Ukjent verdi! Input må være tall mellom fra og med 1 til og med 5.");
            }

        
        }while(true);
    }

    // Leser fra fil, og legger pasienter, resepter og leger inn i legesystemet.
    public void lesFraFil(String fil) throws Exception {
        int status = 0;
        Scanner scan = new Scanner(new File(fil));

        while (scan.hasNextLine()) {
            String line;
            line = scan.nextLine();
            // Om det er en # i linjen, bytter 
            if (line.contains("#")) {
                status++;
                line = scan.nextLine();
            }

            if (status == 1) {
                pasienter.leggTil(new Pasient(line.split(",")[0], line.split(",")[1]));
            }
            else if (status == 2) {
                String navn = line.split(",")[0];
                String type = line.split(",")[1];
                int pris = Integer.parseInt(line.split(",")[2]);
                double virkestoff = Double.parseDouble(line.split(",")[3]);



                if (type.equals("narkotisk")) {
                    int styrke = Integer.parseInt(line.split(",")[4]);
                    legemidler.leggTil(new Narkotisk(navn, pris, virkestoff, styrke));
                }
                else if (type.equals("vanedannende")) {
                    int styrke = Integer.parseInt(line.split(",")[4]);
                    legemidler.leggTil(new Vanedannende(navn, pris, virkestoff, styrke));
                }
                else if (type.equals("vanlig")) {
                    legemidler.leggTil(new Vanlig(navn, pris, virkestoff));
                }
            }
            else if (status == 3) {
                String navn = line.split(",")[0];
                String kontrollId = line.split(",")[1];

                if (kontrollId.equals("0")) {
                    leger.leggTil(new Lege(navn));
                }
                else {
                    leger.leggTil(new Spesialist(navn, kontrollId));
                }
            }
            else if (status == 4) {
                int legemiddelNummer = Integer.parseInt(line.split(",")[0]);
                String legeNavn = line.split(",")[1];
                int pasientId = Integer.parseInt(line.split(",")[2]);
                String type = line.split(",")[3];

                Legemiddel legemiddel = legemidler.hent(legemiddelNummer);
                Pasient pasient = null;
                Lege lege = null;
                for (Pasient pas : pasienter) {
                    if (pas.id == pasientId) {
                        pasient = pas;
                    }
                }
                if (pasient == null) {
                    System.out.println("Pasienten med id nummer: " +  pasientId + " finnes ikke.");
                    return;
                }

                for (Lege leg : leger) {
                    if (legeNavn.equals(leg.navn)) {
                        lege = leg;
                    }
                }
                if (lege == null) {
                    System.out.println("Legen med navn: " +  legeNavn + " finnes ikke.");
                    return;
                }


                if (type.equals("hvit")) {
                    int reit = Integer.parseInt(line.split(",")[4]);
                    Resept resept = lege.skrivResept(legemiddel, pasient, reit);
                    pasient.resepter.leggTil(resept);
                    resepter.leggTil(resept);
                }
                else if (type.equals("blaa")) {
                    if (lege instanceof Spesialist) {
                        int reit = Integer.parseInt(line.split(",")[4]);
                        Resept resept = new BlaaResept(legemiddel, lege, pasient, reit);
                        lege.utskrevneResepter.leggTil(resept);
                        pasient.resepter.leggTil(resept);
                        resepter.leggTil(resept);
                    }
                    else {
                        System.out.println("Blå resept må bli skrevet av spesialist.");
                    }
                }
                else if (type.equals("militaer")) {
                    Resept resept = new MilResept(legemiddel, lege, pasient);
                    lege.utskrevneResepter.leggTil(resept);
                    pasient.resepter.leggTil(resept);
                    resepter.leggTil(resept);
                }
                else if (type.equals("p")) {
                    int reit = Integer.parseInt(line.split(",")[4]);
                    Resept resept = new PResept(legemiddel, lege, pasient, reit);
                    lege.utskrevneResepter.leggTil(resept);
                    pasient.resepter.leggTil(resept);
                    resepter.leggTil(resept);
                }

            }
        }
    }

    public void skrivUt() {
        System.out.println("+------------PASIENTER------------+");
        if (pasienter.stoerrelse() == 0) {
            System.out.println("Det er ingen pasienter i systemet enda.");
        }
        else {
            for (Pasient pasient : pasienter) {
                System.out.println(pasient.toString());
                System.out.println("Resepter registrert for pasienten: "); 
                
                if (pasient.resepter.stoerrelse() == 0) {
                    System.out.println("Pasient har ingen resepter.");
                }
                else {
                    System.out.println(pasient.resepter);
                }
            }
        }
        System.out.println("");
        System.out.println("+--------------LEGER--------------+");
        if (leger.stoerrelse() == 0) {
            System.out.println("Det er ingen leger i systemet enda.");
        }
        else {
            for (Lege lege : leger) {
                System.out.println(lege.toString());
            }
        }
        System.out.println("");
        System.out.println("+------------LEGEMIDLER-----------+");
        if (legemidler.stoerrelse() == 0) {
            System.out.println("Det er ingen legemidler i systemet enda.");
        }
        else {
            for (Legemiddel legemiddel : legemidler) {
                System.out.println(legemiddel.toString());
            }
        }

    }

    public void leggTil() {
        System.out.println("LEGG TIL MENY");
        System.out.println("#1: Legg til Lege");
        System.out.println("#2: Legg til Pasient");
        System.out.println("#3: Legg til Legemiddel");
        System.out.println("#4: Legg til Resept");

        Scanner input = new Scanner(System.in);
        int valg = input.nextInt();
        
        if (valg == 1) {
            leggTilLege();
        }
        else if (valg == 2) {
            leggTilPasient();
        }
        else if (valg == 3) {
            leggTilLegemiddel();
        }
        else if (valg == 4) {
            leggTilResept();
        }
        else {
            System.out.println("Du skrev: " + valg + ", må være et tall mellom 1 og 4");
        }
    }

    public void leggTilLege() {
        Scanner input = new Scanner(System.in);
        System.out.println("Er legen en Spesialist? [Y/N]");

        if (input.nextLine().strip().toLowerCase().equals("y")) {
            System.out.println("Hva heter legen? (paa formen: Dr. [navn])");
            String navn = input.nextLine();
            System.out.println("Hva er kontrollId-en til Spesialisten?");
            leger.leggTil(new Spesialist(navn, input.nextLine()));
        }
        else {
            System.out.println("Hva heter legen? (paa formen: Dr. [navn])");
            leger.leggTil(new Lege(input.nextLine()));
        }
    }

    public void leggTilPasient() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hva heter pasienten?");
        String navn = input.nextLine();
        System.out.println("Hva er foedselsnummeret til pasienten?");
        String foedselsnummer = input.nextLine();

        pasienter.leggTil(new Pasient(navn, foedselsnummer));
    }

    public void leggTilLegemiddel() {
        System.out.println("Hva slags legemiddel?");
        System.out.println("#1: Vanlig");
        System.out.println("#2: Vanedannende");
        System.out.println("#3: Narkotisk ");
        Scanner input = new Scanner(System.in);
        int valg = input.nextInt();
        input.nextLine();

        String navn;
        int pris;
        double virkestoff;
        int styrke;
        if (valg == 1) {
            System.out.println("Hva heter legemiddelet? ");
            navn = input.nextLine(); 
            System.out.println("Hva er prisen? (heltall)");
            pris = input.nextInt();
            System.out.println("Hvor mye virkestoff?");
            virkestoff = input.nextDouble();

            legemidler.leggTil(new Vanlig(navn, pris, virkestoff));
        }
        else if (valg == 2) {
            System.out.println("Hva heter legemiddelet? ");
            navn = input.nextLine(); 
            System.out.println("Hva er prisen? (heltall)");
            pris = input.nextInt();
            System.out.println("Hvor mye virkestoff?");
            virkestoff = input.nextDouble();
            System.out.println("Hvor sterk er legemiddelet?");
            styrke = input.nextInt();

            legemidler.leggTil(new Vanedannende(navn, pris, virkestoff, styrke));
        }
        else if (valg == 3) {
            System.out.println("Hva heter legemiddelet? ");
            navn = input.nextLine(); 
            System.out.println("Hva er prisen? (heltall)");
            pris = input.nextInt();
            System.out.println("Hvor mye virkestoff?");
            virkestoff = input.nextDouble();
            System.out.println("Hvor sterk er legemiddelet?");
            styrke = input.nextInt();

            legemidler.leggTil(new Narkotisk(navn, pris, virkestoff, styrke));
        }
        else {
            System.out.println("Du skrev: " + valg + ", må være et tall mellom 1 og 3");
        }
    }

    public void leggTilResept() {
        Lege lege = null;
        Pasient pasient = null;
        Legemiddel legemiddel = null;
        int reit;
        int pasId;
        String legNavn;
        String legmNavn;


        Scanner input = new Scanner(System.in);

        if (pasienter.stoerrelse() == 0 || leger.stoerrelse() == 0 || legemidler.stoerrelse() == 0) {
            System.out.println("Mangler enten leger, pasienter eller legemidler til aa opprette resepter.");
            return;
        }

        System.out.println("Hvilken pasient skal resepten være til? (skriv inn id)");
        for (Pasient pas : pasienter) {
            System.out.println(pas.toString());
        }

        pasId = input.nextInt();
        input.nextLine();
        for (Pasient pas : pasienter) {
            if (pas.id == pasId) {
                pasient = pas;
            }
        }

        System.out.println("Hvilken lege skal skrive ut resepten? (Oppgi navn: [Dr. *navn*])");
        for (Lege leg : leger) {
            System.out.println(leg.toString());
        }

        legNavn = input.nextLine();
        for (Lege leg : leger) {
            if (legNavn.equals(leg.navn)) {
                lege = leg;
            }
        }

        System.out.println("Hvilken legemiddel skal gis resept til? (Oppgi navn)");
        for (Legemiddel legm : legemidler) {
            System.out.println(legm.toString());
        }

        legmNavn = input.nextLine();
        for (Legemiddel legm : legemidler) {
            if (legmNavn.equals(legm.navn)) {
                legemiddel = legm;
            }
        }

        if (pasient == null) {
            System.out.println("Pasienten finnes ikke.");
            return;
        }
        if (lege == null) {
            System.out.println("Legen finnes ikke, pass paa at du skriver det paa formen 'Dr. [navn]'");
            return;
        }
        if (legemiddel == null) {
            System.out.println("Legemiddelet finnes ikke.");
            return;
        }

        System.out.println("Hvor mange ganger kan resepten bli brukt?");
        reit = input.nextInt();

        System.out.println("Oppretter resept...");

        Resept resept = lege.skrivResept(legemiddel, pasient, reit);
        pasient.resepter.leggTil(resept);
        resepter.leggTil(resept);
        
        }       

    public void brukResept() {
        Pasient pasient = null;
        Resept resept = null;
        int pasId;
        String reseptNavn;

        if (pasienter.stoerrelse() == 0) {
            System.out.println("Det er ingen pasienter registrert enda.");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Hvilken pasient vil du se resepter til? (skriv inn id)");
        for (Pasient pas : pasienter) {
            System.out.println(pas.toString());
        }

        pasId = input.nextInt();
        input.nextLine();
        for (Pasient pas : pasienter) {
            if (pas.id == pasId) {
                pasient = pas;
            }
        }

        if (pasient == null) {
            System.out.println("Pasienten finnes ikke.");
            return;
        }

        System.out.println("Hvilken resept oensker du aa bruke? (Skriv inn legemiddel navn)");
        for (Resept res : pasient.resepter) {
            System.out.println(res.toString());
        }

        reseptNavn = input.nextLine();
        for (Resept res : pasient.resepter) {
            if (res.legemiddel.navn.equals(reseptNavn)) {
                resept = res;
            }
        }

        if (resept == null) {
            System.out.println("Resepten finnes ikke.");
            return;
        }
        if (resept.bruk()) {
            System.out.println("Resepten ble brukt!");
        }
        else {
            System.out.println("Det gaar ikke aa bruke resepten lenger.");
        }
    }

    public void hentStatistikk() {
        System.out.println("+------------STATISTIKK MENY------------+");
        System.out.println("#1 Totalt antall utskrevne resepter på vanedannende legemidler.");
        System.out.println("#2 Totalt antall utskrevne resepter på narkotiske legemidler.");
        System.out.println("#3 Statistikk om mulig misbruk av narkotia.");

        Scanner input = new Scanner(System.in);
        int valg = input.nextInt();
        
        if (valg == 1) {
            vanedannendeStatistikk();
        }
        else if (valg == 2){
            narkotiskStatistikk();
        }
        else if (valg == 3) {
            misbrukStatistikk();
        }
        else {
            System.out.println("Feil input, skriv et tall mellom 1 og 3.");
        }
    }

    public void vanedannendeStatistikk() {
        int teller = 0;

        for (Resept res : resepter) {
            if (res.legemiddel instanceof Vanedannende) {
                teller++;
            }
        }

        System.out.println("Antall utskrevne resepter med Vanedannende legemiddel: " + teller);
    }

    public void narkotiskStatistikk() {
        int teller = 0;

        for (Resept res : resepter) {
            if (res.legemiddel instanceof Narkotisk) {
                teller++;
            }
        }

        System.out.println("Antall utskrevne resepter med Narkotisk legemiddel: " + teller);
    }

    public void misbrukStatistikk() {

        System.out.println("Oversikt over leger med narkotiske resepter, og pasienter med narkotiske resepter.");
        for (Lege lege : leger) {
            int ant = 0;
            for (Resept resept : lege.utskrevneResepter) {
                if (resept.legemiddel instanceof Narkotisk) {
                    ant++;
                }
            }
            if (ant > 0) {
                System.out.println(lege.toString() + " Antall narkotiske resepter: " + ant);
            }

        }

        for (Pasient pasient : pasienter) {
            int ant = 0;
            for (Resept resept : pasient.resepter) {
                if (resept.legemiddel instanceof Narkotisk) {
                    ant++;
                }
            }
            if (ant > 0) {
                System.out.println(pasient.toString() + " Antall narkotiske resepter: " + ant);
            }
        }
    }
}
