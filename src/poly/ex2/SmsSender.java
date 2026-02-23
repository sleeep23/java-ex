package poly.ex2;

public class SmsSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Send SMS: " + message);
    }
}
