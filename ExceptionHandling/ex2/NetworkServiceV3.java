package ExceptionHandling.ex2;


public class NetworkServiceV3 {
    public void sendMessage(String data){
        String address = "http://example.com";

        try (NetworkClientV4 client = new NetworkClientV4(address)) {
            client.initError(data);
            client.connect();
            client.send(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
