package _exer.exer2;

public class BelowZeroException extends Exception {

        static final long serialVersionUID = -33875169939948L;
        public BelowZeroException() {
        }

        public BelowZeroException(String message) {
                super(message);
        }
}
