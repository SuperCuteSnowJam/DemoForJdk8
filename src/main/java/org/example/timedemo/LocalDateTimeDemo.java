package org.example.timedemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static java.time.temporal.TemporalAdjusters.firstDayOfMonth;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2013,5,12,12,12,12);
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dt2 = LocalDateTime.of(date,time);
        LocalDateTime dt3 = date.atTime(time);
        LocalDateTime dt4 = time.atDate(date);

        LocalDate date1 = dt.toLocalDate();
        LocalTime time1 = dt.toLocalTime();


        dt.with(firstDayOfMonth());
    }
}
