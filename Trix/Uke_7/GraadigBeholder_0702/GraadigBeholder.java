public class GraadigBeholder<E extends Comparable<E>> {
    E element = null;

    public E settInn(E e) {
        if (element == null) {
            element = e;
            System.out.println("Beholderen er tom, setter inn...");
            return null;
        }
        else {
            if (e.compareTo(element) >= 0) {
                System.out.println("Det nye elementet er av høyere eller lik verdi, setter det inn...");
                E gammel = element;
                element = e;
                return gammel;
            }
            System.out.println("Det nye elementet er av lavere verdi, setter ikke inn...");
            return null;
        }
    }

    public E taUt() {
        return element;
    }
}