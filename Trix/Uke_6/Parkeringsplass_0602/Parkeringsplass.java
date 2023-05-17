public class Parkeringsplass<E> {
    public E parkertKjoretoy;

    public void parker(E kjoretoy) {
        parkertKjoretoy = kjoretoy;
    }

    public E kjorUt() {
        E temp = parkertKjoretoy;
        parkertKjoretoy = null;
        return temp;
    }
}
