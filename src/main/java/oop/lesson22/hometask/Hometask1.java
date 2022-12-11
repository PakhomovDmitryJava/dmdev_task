package oop.lesson22.hometask;

import oop.lesson19.hometask3.TextUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Задан файл со стихотворением Александра Пушкина. Определить частоту повторяемости всех букв в стихотворении, игнорируя регистр.
 * Вывести результат в файл в виде:
 * а - 15
 * б - 7
 * я - 11
 */
public class Hometask1 {
    public static void main(String[] args) {
        Path path = Path.of("", "test.txt");
        try {
            countLettersIgnoreCase(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void countLettersIgnoreCase(Path path) throws IOException {
        Path resultedPath = Path.of("", "poemResult.txt");
        List<String> textAsListOfWords =  TextUtil.getTextAsListOfLetters(Files.readString(path));
        Collections.sort(textAsListOfWords);
        LinkedHashSet<String> strings = new LinkedHashSet<>(textAsListOfWords);
        StringBuilder sb = new StringBuilder();
        for (String letter : strings) {
            sb.append(String.format("Letter %s - %s times%n", letter, Collections.frequency(textAsListOfWords, letter))).append("\n");
        }
        Files.writeString(resultedPath, sb.toString());

    }

}
