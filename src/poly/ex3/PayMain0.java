package poly.ex3;

public class PayMain0 {
    static void main() {
        PayService payService = new PayService();

        // kakao
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        // naver
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        // wrong
        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);

        // new
        String payOption4 = "new";
        int amount4 = 15000;
        payService.processPay(payOption4, amount4);

    }
}
