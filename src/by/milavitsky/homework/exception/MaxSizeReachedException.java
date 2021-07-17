package by.milavitsky.homework.exception;

public class MaxSizeReachedException extends RuntimeException {
    public MaxSizeReachedException() {
    }

    public MaxSizeReachedException(String message) {
        super(message);
    }

    public MaxSizeReachedException(String message, Throwable cause) {
        super(message, cause);
    }

    public MaxSizeReachedException(Throwable cause) {
        super(cause);
    }
}
