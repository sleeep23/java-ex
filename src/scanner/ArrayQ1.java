package scanner;

import java.util.Scanner;

public class ArrayQ1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 5 numbers: ");
        int[] numbers = new int[5];

        // enter
        for (int i = 0; i<5; i++){
            numbers[i] = scanner.nextInt();
        }

        // reverse print
        for (int i = numbers.length-1; i >= 0; i--){
            System.out.print(numbers[i]);
            if (i == 0){
                break;
            }
            System.out.print(",");
        }
    }
}
