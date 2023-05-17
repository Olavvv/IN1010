import java.util.ArrayList;

public class SortertArrayList<T extends Comparable<T>> {
    public ArrayList<T> liste = new ArrayList<T>();

    public void settInn(T data) {
        for (T t : liste) {
            if (data.compareTo(t) <= 0) {
                liste.add(liste.indexOf(t), data);
                return;
            }
        }
        liste.add(data); 
    }

    public T hentUtForste() {
        return liste.remove(0);
    }

    public int storrelse() {
        return liste.size();
    }
}