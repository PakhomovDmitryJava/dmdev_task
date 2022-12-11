package oop.lesson24.task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 3. Дана строка вида "26-03-1968T09:24". Получить объект LocalDateTime, представляющий
 * собой дату, полученную из этой строки.
 */
public class Task3 {
    public static void main(String[] args) {
        String formatDate = "26-03-1968T09:24";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime date = LocalDateTime.parse(formatDate, formatter);
        System.out.println(date);
    }
}
