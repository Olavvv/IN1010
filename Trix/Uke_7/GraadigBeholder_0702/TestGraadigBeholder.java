public class TestGraadigBeholder {
    public static void main(String[] args) {
        GraadigBeholder<String> beholder = new GraadigBeholder<String>();

        String str1 = "yippie";
        String str2 = "oogabooga";
        System.out.println(str1.compareTo(str2));

        beholder.settInn(str1);
        beholder.settInn(str2);

    }
}
