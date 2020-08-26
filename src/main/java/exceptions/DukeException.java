package exceptions;

/**
 * Class to give the standard behaviors of the duke exceptions.
 */
public class DukeException extends Exception {
    public DukeException(String errorMessage) {
        super(errorMessage);
    }
}
