package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateEx1 {
    static void main() {
        LocalDate startDate = LocalDate.of(2024,1,1);
        for (int i = 0; i < 5; i++) {
            LocalDate nextDate = startDate.plusWeeks(2 * i);
            System.out.println("date " + (i+1) + ": " + nextDate);
        }
    }
}
