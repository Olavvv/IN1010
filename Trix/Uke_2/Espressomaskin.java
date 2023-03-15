public class Espressomaskin {
    public int vannMengde = 1000;

    // Lag espresso dersom det er nok vann
    public void lagEspresso() {   
        if (vannMengde >= 40) {
            System.out.println("Lager en Espresso!");
            vannMengde -= 40;
            System.out.println("Du har naa: " + vannMengde + "mL i vanntanken.");
        }
        else {
            System.out.println("Det er ikke nok vann for å lage en Espresso, du har: " + vannMengde + "mL i vanntanken.");
        }
    }

    // Lag lungo dersom det er nok vann
    public void lagLungo() {   
        if (vannMengde >= 110) {
            System.out.println("Lager en Lungo!");
            vannMengde -= 110;
            System.out.println("Du har naa: " + vannMengde + "mL i vanntanken.");
        }
        else {
            System.out.println("Det er ikke nok vann for å lage en Lungo, du har: " + vannMengde + "mL i vanntanken.");
        }
    }
    
    // Fyll på et gitt antall milliliter vann, dersom det er plass
     public void fyllVann(int ml) {   
        vannMengde += ml;
     }
    
    // Les av målestrekene på vanntanken og tilgjengelig vann i ml
    public int hentVannmengde() {   
        return vannMengde;
    }
    
}
