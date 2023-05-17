public class Hovedprogram {
    public static void main(String[] args) {
        SortertArrayList<Katt> kattArray = new SortertArrayList<Katt>();
        Katt katt1 = new Katt("yngst", 1);
        Katt katt2 = new Katt("midt1", 4);
        Katt katt3 = new Katt("midt2", 4);
        Katt katt4 = new Katt("eldst", 8);

        kattArray.settInn(katt4);
        kattArray.settInn(katt2);
        kattArray.settInn(katt3);
        kattArray.settInn(katt1);

        for (int i = 0; i < kattArray.storrelse(); i++) {
            System.out.println(kattArray.liste.get(i));
        }
    }
}
