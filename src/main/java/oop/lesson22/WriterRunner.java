package oop.lesson22;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriterRunner {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("", "writer.txt");
//        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true))) {
        Files.write(path, List.of("Hello World! Java"));
        try (BufferedWriter fileWriter = Files.newBufferedWriter(path)) {

            fileWriter.append("Hello World!");
            fileWriter.newLine();
            fileWriter.append("Java!");
            fileWriter.newLine();
        }
    }
}
