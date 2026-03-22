package nested;

class OuterClass4Main {
    static void main() {
        Hello helloAnonymous = new Hello() {
            @Override
            public void hello() {
                System.out.println("hello from anonymous");
            }
        };
        helloAnonymous.hello();
    }
}
