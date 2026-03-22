package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    static void main() {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016,8,16,8,10,1);
        System.out.println("now date: " + nowDt);
        System.out.println("offset date: " + ofDt);

        // separate date and time
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("local date: " + localDate);
        System.out.println("local time: " + localTime);
    }
}
