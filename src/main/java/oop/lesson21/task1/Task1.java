package oop.lesson21.task1;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

/**
 * 1. Дан список целых чисел. Найти среднее всех
 * нечётных чисел, делящихся на 5.
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(14, 15, 20, 25, 44, 23, 54, 76, 43);
        OptionalDouble optionalDouble = integers.stream()
                .filter(integer -> integer % 5 == 0 && integer % 2 != 0)
                .mapToInt(Integer::intValue)
                .average();
        optionalDouble.ifPresent(System.out::println);
    }
}
