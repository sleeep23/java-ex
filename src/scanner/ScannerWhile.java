package scanner;

import java.util.Scanner;
public class ScannerWhile {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter string(exit: end)");
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                System.out.println("exit program");
                break;
            }
            System.out.println("entered string: " + str);
        }
    }
}
