package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    static void main() {
        Scanner input = new Scanner(System.in);
        while (true) {
            int number = input.nextInt();

            if (number == 0) {
                break;
            }
        }
    }
}
