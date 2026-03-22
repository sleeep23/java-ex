package time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class CalenderEx1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter year: ");
        int year = scanner.nextInt();
        System.out.print("enter month: ");
        int month = scanner.nextInt();

        printCalendar(year, month);
    }

    private static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        // 월 ~ 일 위치 역할
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("SU MO TU WE TH FR SA ");

        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }

        LocalDate dayIterator = firstDayOfMonth;
        while (dayIterator.isBefore(firstDayOfNextMonth)) {
            System.out.printf("%2d ", dayIterator.getDayOfMonth());
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }
    }
}
