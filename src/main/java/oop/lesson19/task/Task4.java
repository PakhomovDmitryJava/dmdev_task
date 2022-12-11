package oop.lesson19.task;

import java.util.*;

/**
 * 4. Сложить два многочлена заданной степени, если коэффициенты
 * многочлена хранятся в объекте HashMap в виде:
 * Ключ: номер степени
 * Значение: значение множителя
 * Вывести результирующий многочлен в виде строки: ax^6 + bx^4 +
 * cx^3 + dx + 8
 */
public class Task4 {
    public static void main(String[] args) {
        Map<Integer, Integer> polynomial1 = Map.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Integer, Integer> polynomial2 = Map.of(3, 4, 0, 9, 7, 5, 5, 3, 4, 8);
        sum(polynomial1, polynomial2);
        System.out.println(convertToString(sum(polynomial1, polynomial2)));
    }

    public static Map<Integer, Integer> sum(Map<Integer, Integer> polynomial1,
                                            Map<Integer, Integer> polynomial2) {
        HashMap<Integer, Integer> polynomialResult = new HashMap<>(polynomial1);
        for (Map.Entry<Integer, Integer> entry : polynomial2.entrySet()) {
            Integer value = polynomialResult.getOrDefault(entry.getKey(), 0);
            polynomialResult.put(entry.getKey(), value + entry.getValue());
        }
        return polynomial1;
    }

    public static String convertToString(Map<Integer, Integer> map) {
        Map<Integer, Integer> result = new TreeMap<>(Comparator.reverseOrder());
        result.putAll(map);
        List<String> strings = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            strings.add(entry.getValue() + "x^" + entry.getKey());
        }
        return String.join(" + ", strings);
    }

}
