package oop.lesson22.task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;

/**
 * 4. Задан файл с java-кодом. Прочитать текст программы из файла и
 * все слова public в объявлении атрибутов и методов класса заменить
 * на слово private. Результат сохранить в другой заранее созданный
 * файл.
 */
public class Task4 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("", "code.txt");
        myReplacePublicAccessModifier(path);
    }


    public static void myReplacePublicAccessModifier(Path path) throws IOException {
        String code = Files.readString(path);
        String result = code.replace("public", "private");
        Files.write(Path.of("", "codeReplaced.txt"), Collections.singleton(result));
    }

    public static void denisReplacePublicAccessModifier(Path path) throws IOException {
        String stringValue = Files.readString(path);
        String result = stringValue.replace("public", "private");
        Path resultPath = Path.of("", "Task3.java");
        Files.writeString(resultPath, result);
    }
}
