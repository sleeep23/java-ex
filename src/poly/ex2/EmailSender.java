package poly.ex2;

public class EmailSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Send Email: " + message);
    }
}
