package _exer.exer1;

public class NoLifeValueException extends RuntimeException{

    static final long serialVersionUID = -703489719066939L;

    public NoLifeValueException() {
    }

    public NoLifeValueException(String message) {
        super(message);
    }
}
