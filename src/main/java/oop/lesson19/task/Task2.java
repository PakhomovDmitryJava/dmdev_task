package oop.lesson19.task;

import java.util.*;


/**
 * 2. Написать метод countUnique, который принимает целочисленный
 * список в качестве параметра и возвращает количество уникальных
 * целых чисел в этом списке.
 * При получении пустого списка метод должен возвращать 0.
 * Пример:
 * [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] вернёт 5.
 */
public class Task2 {
    public static void main(String[] args) {
        List<Integer> integers1 = List.of(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        System.out.println(countUniqueNumbers(integers1));
        List<Integer> integers2 = List.of();
        System.out.println(countUniqueNumbers(integers2));
    }

    public static int countUniqueNumbers(List<Integer> integers) {
        return new HashSet<>(integers).size();
    }
}
