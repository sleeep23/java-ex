package nested;

public class OuterClass2Main {
    static void main() {
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass2 inner = outer.new InnerClass2();
        inner.hello();
    }
}
