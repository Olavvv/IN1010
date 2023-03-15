
public class TestGruppeoppmoete {
    public static void main(String[] args) throws Exception {
        Gruppeoppmoete gruppe = new Gruppeoppmoete();
        gruppe.lesFraFil();
        gruppe.registrerOppmoete("Nille");
        gruppe.registrerOppmoete("Teodor");
        gruppe.skrivUt();

    }
    
}
