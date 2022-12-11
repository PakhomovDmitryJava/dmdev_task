package oop.lesson22;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamRunner {
    public static void main(String[] args) throws IOException {
//        File file = new File(String.join(File.separator, "resources", "test.txt"));
        File file = Path.of("", "test.txt").toFile();
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            byte[] bytes = new byte[fileInputStream.available()];
            int counter = 0;
            byte curentByte;
            while ((curentByte = (byte) fileInputStream.read()) != -1) {
                bytes[counter++] = curentByte;
            }
            String stringValue = new String(bytes);
            System.out.println(stringValue);
//            fileInputStream.read();
//            String stringValue = new String(bytes);
//            System.out.println(stringValue);
        }
    }
}
