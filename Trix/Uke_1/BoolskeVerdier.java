package Uke_1;
public class BoolskeVerdier {
    public static void main(String[] args) {
        Boolean sann = true;
        Boolean usann = false;

        System.out.println(sann);

        if (sann != usann) {
            System.out.println("Første test slo til!");
        }

        if (sann == usann) {
            System.out.println("Andre test slo til!");
        }
        else {
            System.out.println("Andre test slo ikke til :(");
        }
    }
}
