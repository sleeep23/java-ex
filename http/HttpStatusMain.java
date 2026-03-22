package http;

import java.util.Scanner;

public class HttpStatusMain {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("HTTP CODE: ");
        int httpCodeInput = scanner.nextInt();

        HttpStatus status = HttpStatus.findByCode(httpCodeInput);
        if (status == null) {
            System.out.println("Undefined code");
        } else {
            System.out.println(status.getCode() + " " + status.getMessage());
            System.out.println("isSuccess = " + status.isSuccess());
        }
    }
}
