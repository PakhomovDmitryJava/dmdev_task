package oop.lesson24.task;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 4. Создать объект LocalDate, представляющий собой сегодняшнюю
 * дату. Создать объект LocalDate, представляющий собой дату
 * 07.07.2018. Используя созданные объекты, найти количество дней между
 * этими двумя датами.
 */
public class Task5 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate past = LocalDate.of(2018, 7, 7);
        long days = (now.toEpochDay() - past.toEpochDay());
        System.out.println(days);


        Period between = Period.between(past, now);
        System.out.println(between.getDays());
        System.out.println(between.getMonths());
        System.out.println(between.getYears());

        long between1 = ChronoUnit.DAYS.between(past, now);
        long between2 = ChronoUnit.MONTHS.between(past, now);
        long between3 = ChronoUnit.YEARS.between(past, now);
        System.out.println(between1);
        System.out.println(between2);
        System.out.println(between3);
    }
}
