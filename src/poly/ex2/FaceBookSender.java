package poly.ex2;

public class FaceBookSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Send Facebook: " + message);
    }
}
