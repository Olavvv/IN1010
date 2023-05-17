import java.util.ArrayList;

public class TestRovPlant {
    public static void main(String[] args) {
        Bjorn bjorn = new Bjorn();
        Ulv ulv = new Ulv();
        Sau sau = new Sau();
        Elg elg = new Elg();

        ArrayList<RovdyrGrensesnitt> rovdyr = new ArrayList<RovdyrGrensesnitt>();
        ArrayList<PlanteeterGrensesnitt> planteetere = new ArrayList<PlanteeterGrensesnitt>();
        rovdyr.add(bjorn);
        rovdyr.add(ulv);
        planteetere.add(sau);
        planteetere.add(elg);

        for (RovdyrGrensesnitt rov : rovdyr) {
            rov.Jakt();
        }
        for ( PlanteeterGrensesnitt plante : planteetere) {
            plante.Beskytt();
        }
    }
}
