package scanner;

import java.util.Scanner;

public class ArrayQ3 {
    static void main() {
        int maxProducts = 1;
        Scanner scanner = new Scanner(System.in);
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료 ");
            System.out.print("메뉴를 선택하세요: ");
            int selectedMenuNum = scanner.nextInt();

            // 종료 조건
            if (selectedMenuNum == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (selectedMenuNum == 1) {
                productCount += 1;
                // 더 이상 등록 안되는 경우
                if (productCount > maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    break;
                }
                System.out.print("상품 이름을 입력하세요: ");
                productNames[productCount - 1] = scanner.next();
                System.out.print("상품 가격을 입력하세요: ");
                productPrices[productCount - 1] = scanner.nextInt();
            }

            if (selectedMenuNum == 2){
                // 등록된 상품 없을 경우
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    break;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }
            }


        }
    }
}
