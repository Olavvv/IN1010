import java.util.ArrayList;

public class Brev {
    String _avsender;
    String _mottaker;
    public ArrayList<String> _linjer;


    public Brev(String avsender, String mottaker) {
        _avsender = avsender;
        _mottaker = mottaker;
        _linjer = new ArrayList<String>();
    }

    // Method to add 'linje' to ArrayList '_linjer'.
    public void skrivLinje(String linje) {
        _linjer.add(linje);
    }

    public void lesBrev() {
        System.out.println("Hei, " + _mottaker);
        System.out.println();
        for (String linje : _linjer) {
            System.out.println(linje);
        }
        System.out.println();
        System.out.println("Hilsen fra, ");
        System.out.println(_avsender);
    }   
}
