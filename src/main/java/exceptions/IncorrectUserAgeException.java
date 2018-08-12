package exceptions;

public class IncorrectUserAgeException extends Exception {

    public IncorrectUserAgeException(final String message) {
        super(message);
    }
}