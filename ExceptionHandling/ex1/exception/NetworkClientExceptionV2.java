package ExceptionHandling.ex1.exception;

public class NetworkClientExceptionV2 extends Exception {
    private String errorCode;

    public NetworkClientExceptionV2(String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
