package oop.lesson21.task1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 2. Дан список строк. Найти количество уникальных
 * строк длиной более 8 символов.
 */
public class Task2 {
    public static void main(String[] args) {
        List<String> strings = List.of("string-1",
                "ssstring-1",
                "ssstring-2",
                "ss-2",
                "ssstring-3",
                "ssstring-4",
                "ssstring-4",
                "ssstring-5",
                "ssstring-5",
                "ssstring-6",
                "ssstring-8",
                "ssstring-9",
                "ss-1",
                "ssstring-10",
                "ssstring-11"
        );
        int result1 = strings.stream()
                .filter(s -> s.length() > 8)
                .collect(Collectors.toSet())
                .size();
        System.out.println(result1);

        long result2 = strings.stream()
                .filter(value -> value.length() > 8)
                .distinct()
                .count();
        System.out.println(result2);
    }
}
