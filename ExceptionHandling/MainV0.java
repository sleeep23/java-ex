package ExceptionHandling;

import java.util.Scanner;

public class MainV0 {
    static void main() {
        NetworkServiceV0 networkService = new NetworkServiceV0();

        // input 받기
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("메세지를 입력하세요...: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
