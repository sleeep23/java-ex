package poly.ex3;

public abstract class PayStore {
    public static Pay findPay(String option) {
        return switch (option) {
            case "kakao" -> new KakaoPay();
            case "naver" -> new NaverPay();
            case "new" -> new NewPay();
            default -> new DefaultPay();
        };
    }
}
