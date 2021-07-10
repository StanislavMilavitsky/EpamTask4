package by.milavitsky.homework.exception;

public class IncorrectIdException extends Exception {
    public IncorrectIdException() {
    }

    public IncorrectIdException(String message) {
        super(message);
    }

    public IncorrectIdException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectIdException(Throwable cause) {
        super(cause);
    }
}
