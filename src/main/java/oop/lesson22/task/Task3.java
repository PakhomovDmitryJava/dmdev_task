package oop.lesson22.task;

import oop.lesson19.hometask3.TextUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * 3. Задан файл с текстом. В каждой строке найти и вывести
 * наибольшее число цифр, идущих подряд.
 */
public class Task3 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("", "test.txt");
        denisMethodCountDigits(path);
    }

    public static void denisMethodCountDigits(Path path) throws IOException {
        List<String> words = TextUtil.getTextAsListOfWords(Files.readString(path));
        Files.readAllLines(path).stream()
                .map(Task3::findMaxDigitsCount)
                .forEach(System.out::println);
    }

    private static Integer findMaxDigitsCount(String line) {
        int result = 0;
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i))) {
                counter++;
            } else {
                if (result < counter) {
                    result = counter;
                }
                counter = 0;
            }
        }
        return result;
    }
}
