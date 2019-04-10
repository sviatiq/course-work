package exceptions;

public class TransportPermitException extends Exception {
    private String code;

    public String getCode() {
        return code;
    }

    public TransportPermitException(String code, String message) {
        super(message);
        this.code = code;
    }

    public TransportPermitException(String message, Throwable cause, String code) {
        super(message, cause);
        this.code = code;
    }
}
