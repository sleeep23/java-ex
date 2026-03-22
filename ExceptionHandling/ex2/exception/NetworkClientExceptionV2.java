package ExceptionHandling.ex2.exception;

public class NetworkClientExceptionV2 extends RuntimeException {
    private String errorCode;

    public NetworkClientExceptionV2(String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
