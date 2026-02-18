package static1.ex2;

public class MathArrayUtilsMain {
    static void main() {
        int[] values = {1,2,3,4,5};
        System.out.println("sum=" + MathArrayUtils.sum(values));
        System.out.println("average=" + MathArrayUtils.average(values));
        System.out.println("max=" + MathArrayUtils.max(values));
        System.out.println("min=" + MathArrayUtils.min(values));
    }
}
