package oop.lesson22.task;

import oop.lesson19.hometask3.TextUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/**
 * 2. Задан файл с текстом, найти и вывести в консоль все слова, для
 * которых последняя буква одного слова совпадает с первой буквой
 * следующего слова
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("", "test.txt");
        myMethodTask2(path);
        denisMethodTask2(path);
    }

    public static void myMethodTask2(Path path) throws IOException {
        List<String> words = TextUtil.getTextAsListOfWords(Files.readString(path));
        for (int i = 0; i < words.size() - 1; i++) {
            if (words.get(i).toLowerCase().endsWith(String.valueOf(words.get(i + 1).toLowerCase().charAt(0)))) {
                System.out.println(words.get(i) + " " + words.get(i + 1));
            }
        }
    }

    public static void denisMethodTask2(Path path) throws IOException {
        try (Scanner scanner = new Scanner(path)) {
            String prev = null;
            if (scanner.hasNext()) {
                prev = scanner.next();
            }
            while (scanner.hasNext()) {
                String current = scanner.next();
                if (isEqualFistAndLastSymbols(prev, current)) {
                    System.out.println(prev + " - " + current);
                }
                prev = current;
            }
        }
    }

    private static boolean isEqualFistAndLastSymbols(String prev, String current) {
        return prev.charAt(prev.length() - 1) == current.charAt(0);
    }
}
