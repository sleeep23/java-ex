package poly.ex3;

public class PayService {
    public void processPay(String option, int amount) {
        boolean result = false;
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        // 결제수단을 선택하는 것 (찾는 것)
        Pay pay = PayStore.findPay(option);
        result = pay.pay(amount);

        // 결제가 수행되는 것
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }


}
