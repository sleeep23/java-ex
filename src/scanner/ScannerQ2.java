package scanner;

import java.util.Scanner;

public class ScannerQ2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("enter second number: ");
        int num2 = scanner.nextInt();

        // if num1 > num2, exchange
        if (num1 > num2) {
            int temp;
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("every numbers besides num1, num2: ");
        for(int i = num1; i <= num2; i++){
            System.out.print(i);
            if (i == num2) {
                break;
            }
            System.out.print(",");
        }
    }
}
