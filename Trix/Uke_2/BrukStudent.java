public class BrukStudent {
    public static void main(String[] arg) {
        Student stud0 = new Student("Joakim");
        Student stud1 = new Student("Kristin");
        Student stud2 = new Student("Dag");

        for (int i = 0; i < 3; i++) {
            stud0.leggTilQuizScore(10);
            stud1.leggTilQuizScore(15);
            stud2.leggTilQuizScore(20);
        }

        System.out.println("Navn: " + stud0.hentNavn() + " Score: " 
            + stud0.hentTotalScore() + " Gjennomsnitlig Score: " + stud0.hentGjennomsnittligScore());
        
        System.out.println("Navn: " + stud1.hentNavn() + " Score: " 
            + stud1.hentTotalScore() + " Gjennomsnitlig Score: " + stud1.hentGjennomsnittligScore());
        
        System.out.println("Navn: " + stud2.hentNavn() + " Score: " 
            + stud2.hentTotalScore() + " Gjennomsnitlig Score: " + stud2.hentGjennomsnittligScore());
    }
}
