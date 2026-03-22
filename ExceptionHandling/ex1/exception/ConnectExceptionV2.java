package ExceptionHandling.ex1.exception;

public class ConnectExceptionV2 extends NetworkClientExceptionV2 {
    private final String address;
    public ConnectExceptionV2( String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
