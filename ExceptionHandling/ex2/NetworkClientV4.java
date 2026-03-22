package ExceptionHandling.ex2;

import ExceptionHandling.ex2.exception.ConnectExceptionV2;
import ExceptionHandling.ex2.exception.SendExceptionV2;

public class NetworkClientV4 implements AutoCloseable {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV4(String address) {
        this.address = address;
    }

    public void connect() throws ConnectExceptionV2 {
        if (connectError) {
            throw new ConnectExceptionV2(address, address + "서버 연결 실패");
        }
        // 연결 성공
        System.out.println(address + "서버 연결 성공");
    }

    public void send(String data) throws SendExceptionV2 {
        if (sendError) {
            throw new SendExceptionV2(data, address + "서버에 데이터 전송 실패, 데이터: " + data);
//            throw new RuntimeException("ex");
        }
        // 전송 성공
        System.out.println(address + "서버 메세지 전달 성공, message: " + data);
    }

    public void disconnect() {
        System.out.println(address + "서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }

    }

    @Override
    public void close() throws Exception {
        System.out.println("NetworkClientV4.close");
        disconnect();
    }
}
