package theater;

/**
 * Runtime Exception for unknown play type.
 */
public class UnknownPlayTypeException extends RuntimeException {
    public UnknownPlayTypeException(String playType) {
        super(String.format("unknown type: %s", playType));
    }
}
