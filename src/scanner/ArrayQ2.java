package scanner;

import java.util.Scanner;

public class ArrayQ2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[4][3];
        String[] subjects = {"language", "english", "math"};

        for (int i = 0; i < 4; i++){
            System.out.println("enter " + (i+1) + " student score: ");
            for (int j = 0; j < 3; j++) {
                System.out.print("enter " + subjects[j] + " score: ");
                scores[i][j] = scanner.nextInt();
            }
        }

        // output
        for (int i = 0; i < 4; i++){
            int sum = 0;
            for (int j = 0; j < 3; j++){
                sum += scores[i][j];
            }
            double avg = (double) sum / 3;
            System.out.println(i + "student total score: "+sum+", average: "+avg);
        }
    }
}
