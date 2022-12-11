package oop.lesson19.hometask1;

import java.util.Arrays;
import java.util.List;

import static oop.lesson19.hometask1.MarkLengthUtil.markLength4;

/**
 * Написать метод markLength4, принимающий в качестве параметра список (List) строк и размещающий строку "****" перед каждым четырёхсимвольным элементом.
 * Оригинальные элементы должны остаться на месте.
 * Например:
 * {"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"}
 * ->
 * {"****", "this", "is", "****", "lots", "of", "fun", "for", "every", "****", "Java", "programmer"}
 */
public class MarkLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer");
        List<String> result = markLength4(strings);
        for (String s : result) {
            System.out.println(s);
        }
    }

}
