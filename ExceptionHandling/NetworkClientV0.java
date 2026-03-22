package ExceptionHandling;

public class NetworkClientV0 {
    private final String address;
    public NetworkClientV0 (String address) {
        this.address = address;
    }
    public String connect() {
        System.out.println(address + " 서버와 연결되었습니다.");
        return "success";
    }
    public String send(String data) {
        System.out.println(address + " 서버로 데이터를 전송합니다. data: " + data);
        return "success";
    }
    public String disconnect() {
        System.out.println(address + " 서버와 연결이 해제되었습니다.");
        return "success";
    }
}
