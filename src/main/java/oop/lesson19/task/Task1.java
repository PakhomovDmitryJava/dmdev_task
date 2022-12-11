package oop.lesson19.task;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Написать метод, который принимает целочисленный список и возвращает
 * целочисленный список только с нечетными значениями.
 */
public class Task1 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 23, 65, 234, 3, 2, 54, 76, 87, 324);
        System.out.println(deleteEvenNumbers(numbers));

    }

    public static List<Integer> deleteEvenNumbers(List<Integer> integers) {
        List<Integer> result = new ArrayList<>();
        for (Integer integer : integers) {
            if (integer % 2 != 0) {
                result.add(integer);
            }
        }
        return result;
    }

}
