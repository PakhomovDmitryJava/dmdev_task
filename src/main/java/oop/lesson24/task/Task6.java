package oop.lesson24.task;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * 5. Даны два объекта LocalDate из предыдущего задания. Подсчитать количество
 * секунд между полуночью первой даты и полуночью второй даты.
 */
public class Task6 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate past = LocalDate.of(2018, 7, 7);
//        LocalDateTime ldtNow = now.atTime(0, 0);
//        LocalDateTime ldtPast = past.atTime(0, 0);
        LocalDateTime ldtNow = now.atStartOfDay();
        LocalDateTime ldtPast = past.atStartOfDay();

        long secondsBetween = ldtNow.toEpochSecond(ZoneOffset.ofHours(0)) - ldtPast.toEpochSecond(ZoneOffset.ofHours(0));
        System.out.println(secondsBetween);

        Duration between = Duration.between(ldtPast, ldtNow);
        System.out.println(between.getSeconds());


    }
}
