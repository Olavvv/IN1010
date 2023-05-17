import java.util.function.DoubleUnaryOperator;

public class DuplikatException extends Exception {
    public DuplikatException(String boktittel) {
        super("Denne boken finnes allerede i bokhyllen: " + boktittel);
    }
}
