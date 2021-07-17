package by.milavitsky.homework.exception;

public class IncorrectIdException extends RuntimeException {//todo

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
