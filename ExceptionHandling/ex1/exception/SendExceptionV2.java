package ExceptionHandling.ex1.exception;

public class SendExceptionV2 extends NetworkClientExceptionV2 {
    private final String sendData;

    public SendExceptionV2(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
