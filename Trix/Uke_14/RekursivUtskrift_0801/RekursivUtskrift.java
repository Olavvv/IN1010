class RekursivUtskrift {
    public static void main(String[] args) {
        rekursivUtskrift(1);
    }

    public static void rekursivUtskrift(int i) {
        if (i <= 10) {
            System.out.println(i);
            i++;
            rekursivUtskrift(i);
        }
        else return;
    }
}