package oop.lesson24.task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 1. Создать объект LocalDateTime, представляющий собой
 * дату 25.06.2020 19:47. Используя этот объект, создать другой объект LocalDateTime,
 * представляющий собой дату через 3 месяца после сегодняшней.
 * Вывести на консоль содержащиеся в нем объекты LocalDate and LocalTime.
 */
public class Task1 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyy HH:mm");
        LocalDateTime date = LocalDateTime.of(2020, 6,25,19,47);
        System.out.println(date.format(formatter));
        System.out.println(date.toLocalDate());
        System.out.println(date.toLocalTime());
        LocalDateTime plus = date.plusMonths(3);
        System.out.println(plus.format(formatter));
        System.out.println(plus.toLocalDate());
        System.out.println(plus.toLocalTime());

    }
}
