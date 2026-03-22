package ExceptionHandling.ex1;

import ExceptionHandling.ex1.exception.ConnectExceptionV2;
import ExceptionHandling.ex1.exception.SendExceptionV2;

public class NetworkServiceV2 {
    public void sendMessage(String data){
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV2 e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", message: " + e.getMessage());
        } catch (SendExceptionV2 e) {
            System.out.println("[전송 오류] 전송 데이터: " + e.getSendData() + ", message: " + e.getMessage());
        } finally {
            client.disconnect(); // 다른 exception이 발생할 경우에 밖으로 던져지는 경우 disconnect는 호출되지 않는 경우를 방지
        } // finally 까지 실행되고 예외가 밖으로 던져짐 -> catch에서 잡히지 않는 에러이더라도 finally는 실행됨
    }
}
