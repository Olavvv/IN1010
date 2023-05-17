public class Test {
    public static void main(String[] args) {
        Bachelor bach = new Bachelor("per", 22, "Fysikk", "uio");
        Master mast = new Master("arne", 26, "Biologi", "uio");
        Professor prof = new Professor("prof bjorn", 45, 550, "Fysikk", "Kjernefysikk");
        Forsker fors = new Forsker("Dr bengt", 60, 700, "Matreal Teknologi");

        System.out.println(bach);
        System.out.println(mast);
        System.out.println(prof);
        System.out.println(fors);
    }   
}
