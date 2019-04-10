package exceptions;

public class PilotsException extends Exception{
    private String trouble;

    public String getTrouble() {
        return trouble;
    }

    public PilotsException(String message, String trouble) {
        super(message);
        this.trouble = trouble;
    }

    public PilotsException(String message, Throwable cause, String trouble) {
        super(message, cause);
        this.trouble = trouble;
    }
}
