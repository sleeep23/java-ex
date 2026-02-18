package scanner;

import java.util.Scanner;

public class ScannerQ1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your name: ");
        String name = scanner.nextLine();

        System.out.println("enter your age: ");
        int age = scanner.nextInt();

        System.out.println("your name is " + name + ", your age is " + age);

    }
}
