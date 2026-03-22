package wrapper;

public class WrapperExample {
    static void main() {
        String str = "100";
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 : " + integer1);

        int intValue = integer1;
        System.out.println("intValue = " + intValue);
    }
}
