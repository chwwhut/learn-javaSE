package _throw;

public class BelowZeroException extends Exception{

    static final long serialVersionUID = -3387516999948L;

    public BelowZeroException() {
    }

    public BelowZeroException(String message) {
        super(message);
    }

    public BelowZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
