public class TestTidspunkt {
    public static void main(String[] args) {

        Tidspunkt storst = new Tidspunkt(10, 10, 10, 10, 10, 10);
        Tidspunkt med1 = new Tidspunkt(5, 5, 5, 5, 5, 5);
        Tidspunkt med2 = new Tidspunkt(5, 5, 5, 5, 5, 5);
        Tidspunkt minst = new Tidspunkt(2,2,2,2,2,2);

        System.out.println("Sammenligner storste mot minste: " + storst.compareTo(minst));
        System.out.println("Sammenligner storste mot minste: " + storst.compareTo(minst));
        System.out.println("Sammenligner storste mot minste: " + storst.compareTo(minst));
    }
}
