package oop.lessson27.task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 2. Написать программу, выполняющую поиск в строке
 * шестнадцатеричных чисел, записанных по правилам Java,
 * с помощью регулярных выражений и выводящую их на страницу.
 */
public class Task2 {
    public static void main(String[] args) {
        String regex = "(0[Xx])([0-9A-Fa-f]+)";
        String input = "asdasd asd asd 0xff 0x12 0XAB sdfsd 123123";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
