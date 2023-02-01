package Uke_1;
class Baat 
{

    private static int antProd = 0;
    private int prodnr;
    private String merke;

    public Baat(String mrk) 
    {
        prodnr = antProd;
        antProd++;
        merke = mrk;
    }

    public String hentInfo() 
    {
        return "Produksjonsnummer: " + prodnr + ", merke: " + merke;
    }
}

class Baathus 
{
    Baat [] baathus;

    //Instansvariabel array. 
    //Blir fyllt opp av objekter av Baat-klassen.
    public Baathus (int antallPlasser)                                              
    {                                       
        baathus = new Baat[antallPlasser];
    }

    //Itererer gjennom arrayen 'baathus'.
    //Hvis ledig plass: plasser 'baat'-objekt i arrayet.
    public void settInn (Baat baat) 
    {
        System.out.println("Forsøker å plassere " + baat + " inn i baathus.");
        for (int i = 0; i < baathus.length; i++) 
        {
            if (baathus[i] == null) 
            {
                baathus[i] = baat;
                break;
            }
            else
            {
                System.out.println("Plass nummer: " + i + " Er opptatt.");
            }
        }
    }

    public void skrivBaater () 
    {
        for (int i = 0; i < baathus.length; i++) 
        {
            if (baathus[i] != null)
            {
                System.out.println(baathus[i].hentInfo());
            }
        }
    }
}

class TestBaathus
{
    public static void main (String[] args)
    {
        Baathus baatHus = new Baathus(3);

        Baat baat1 = new Baat("C");
        Baat baat2 = new Baat("A");
        Baat baat3 = new Baat("B");
        Baat baat4 = new Baat("F");

        baatHus.settInn(baat1);
        baatHus.settInn(baat2);
        baatHus.settInn(baat3);
        baatHus.settInn(baat4);
        
    }
}
