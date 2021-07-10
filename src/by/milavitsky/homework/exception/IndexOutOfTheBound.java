package by.milavitsky.homework.exception;

public class IndexOutOfTheBound extends Exception {
    public IndexOutOfTheBound() {
    }

    public IndexOutOfTheBound(String message) {
        super(message);
    }

    public IndexOutOfTheBound(String message, Throwable cause) {
        super(message, cause);
    }

    public IndexOutOfTheBound(Throwable cause) {
        super(cause);
    }
}
