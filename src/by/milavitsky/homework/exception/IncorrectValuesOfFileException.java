package by.milavitsky.homework.exception;

public class IncorrectValuesOfFileException extends Exception {
    public IncorrectValuesOfFileException() {
    }

    public IncorrectValuesOfFileException(String message) {
        super(message);
    }

    public IncorrectValuesOfFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectValuesOfFileException(Throwable cause) {
        super(cause);
    }
}
