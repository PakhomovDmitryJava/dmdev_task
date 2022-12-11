package oop.lesson21.task1;

import java.util.Map;

/**
 * Дана Map<String, Integer>. Найти сумму всех
 * значений, длина ключей которых меньше 7
 * символов.
 */
public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "String123", 10,
                "String", 11,
                "String123123", 12,
                "String333", 13,
                "String1232323", 14,
                "Strin", 15,
                "String12333", 16,
                "String1233113", 17,
                "Stri", 18,
                "Str", 19
        );

        int result = map.entrySet().stream()
                .filter(entry -> entry.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println(result);
    }
}
