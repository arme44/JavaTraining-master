package training.core.exceptions;

public class RangeException extends Exception {

    private String msg=""; // może być wywołany z innych metod, aby nie było null dalemy choć pusty string

    public RangeException() {
        msg = "Don't try get value outer memory ";
    }

    public RangeException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return msg + super.toString();
    }
}
