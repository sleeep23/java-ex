package poly.ex3;

import java.util.Scanner;

public class PayMain1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.print("결제 수단을 입력하세요: ");
            String payOption = scanner.next();

            if (payOption.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.print("결제 금액을 입력하세요: ");
            int payAmount = scanner.nextInt();
            scanner.nextLine(); // buffer에 \n 남아있기에

            payService.processPay(payOption, payAmount);
        }

    }
}
