package by.learn.lifo.exception;

public class WrongStackIndexException extends Exception {
    public WrongStackIndexException() {
    }

    public WrongStackIndexException(String message) {
        super(message);
    }

    public WrongStackIndexException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongStackIndexException(Throwable cause) {
        super(cause);
    }
}
