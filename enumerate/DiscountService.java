package enumerate;

public class DiscountService {
    public int discount(ClassGradeEx1 classGradeEx1, int price) {
        int discountPercent = 0;

        if (classGradeEx1 == ClassGradeEx1.SILVER) {
            discountPercent = 10;
        } else if (classGradeEx1 == ClassGradeEx1.GOLD) {
            discountPercent = 20;
        } else if (classGradeEx1 == ClassGradeEx1.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인은 없습니다.");
        }

        return price * (100 - discountPercent) / 100;
    }
}
