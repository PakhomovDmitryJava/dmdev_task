package oop.lesson22.task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

/**
 * 5. Задан файл с java-кодом. Прочитать текст программы из файла и
 * записать в другой файл в обратном порядке символы каждой
 * строки.
 */
public class Task5 {
    public static void main(String[] args) {
        Path path = Path.of("", "code.txt");
        try {
            reversCode(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void reversCode(Path path) throws IOException {
        Path resultedPath = Path.of("", "codeReversed.txt");
        StringBuilder sb = new StringBuilder();
        List<String> strings = Files.readAllLines(path);
        strings.forEach(string -> sb.append(new StringBuffer(string).reverse()).append("\n"));
        Files.write(resultedPath, Collections.singleton(sb.toString()));
    }
}

