package oop.lesson22.hometask;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

import static java.nio.file.StandardOpenOption.*;

/**
 * Создать программно и заполнить файл случайными целыми числами.
 * После чего отсортировать содержимое файла по возрастанию (т.е. перезаписать файл с новым порядком чисел)
 */
public class Hometask2 {
    public static void main(String[] args) {
        Path path = Path.of("", "randomNumbers.txt");
        try {
            writeRandomNumbersToFile(path, randomNumbersGenerator(100));
            sortFileWithNumbers(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void writeRandomNumbersToFile(Path path, ArrayList<Integer> numbers) throws IOException {
        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                Files.writeString(path, String.format("%s", numbers.get(i).toString()), CREATE, APPEND);
            } else {
                Files.writeString(path, String.format("%s\n", numbers.get(i).toString()), CREATE, APPEND);
            }
        }
    }

    public static void sortFileWithNumbers(Path path) throws IOException {
        StringBuffer sb = new StringBuffer();
        Files.readAllLines(path)
                .stream()
                .map(Integer::parseInt)
                .sorted()
                .forEach(number -> sb.append(number).append("\n"));
        Files.write(path, Collections.singleton(sb.toString()), CREATE, TRUNCATE_EXISTING);
    }

    public static ArrayList<Integer> randomNumbersGenerator(int value) {
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        ArrayList<Integer> numbers = new ArrayList<>(value);
        for (int i = 0; i < value; i++) {
            numbers.add(tlr.nextInt());
        }
        return numbers;
    }
}
