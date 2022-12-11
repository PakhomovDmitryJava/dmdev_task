package oop.lesson24;

import java.time.Month;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        long toEpochMilli = now.toInstant().toEpochMilli();
        System.out.println(toEpochMilli);

        ZonedDateTime plusDay = now.plus(1L, ChronoUnit.DAYS);
        System.out.println(plusDay);

        ZonedDateTime zonedDateTime = now.truncatedTo(ChronoUnit.DAYS);
        System.out.println(zonedDateTime);

        int second = now.getSecond();
        System.out.println(second);
        int minute = now.getMinute();
        System.out.println(minute);
        int dayOfMonth = now.getDayOfMonth();
        System.out.println(dayOfMonth);
        Month month = now.getMonth();
        System.out.println(month);

    }
}
