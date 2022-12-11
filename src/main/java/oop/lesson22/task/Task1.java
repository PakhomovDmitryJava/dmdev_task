package oop.lesson22.task;

import oop.lesson19.hometask3.TextUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/**
 * 1. Задан файл с текстом, найти и вывести в консоль все слова,
 * начинающиеся с гласной буквы.
 */
public class Task1 {
    private static final String VOWELS = "ауоыэеёяюи";

    public static void main(String[] args) throws IOException {
        List<String> vowels = List.of("а","у","о","ы","э","я","ю","ё","и","е");
        Path path = Path.of("","test.txt");
        myMethodTask1(path,vowels);
        System.out.println();
        denisMethodTask1(path);

    }

    public static void myMethodTask1(Path path, List<String> lettersToFind) throws IOException {
        List<String> words = TextUtil.getTextAsListOfWords(Files.readString(path));
        words.forEach(word -> lettersToFind.forEach(vowel -> {
            if (word.startsWith(vowel.toUpperCase()) || word.startsWith(vowel.toLowerCase())) {
                System.out.println(word);
            }
        }));
    }

    public static void denisMethodTask1(Path path) throws IOException {
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                char firstSymbol = word.charAt(0);
                if (VOWELS.indexOf(firstSymbol) != -1) {
                    System.out.println(word);
                }
            }
        }
    }
}
