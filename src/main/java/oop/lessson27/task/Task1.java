package oop.lessson27.task;

import java.util.regex.Pattern;

/**
 * 1. Написать программу, проверяющую, является ли введённая
 * строка адресом почтового ящика.
 * В названии почтового ящика разрешить использование только
 * букв, цифр и нижних подчёркиваний, при этом оно должно
 * начинаться с буквы.
 * Возможные домены верхнего уровня: .org .com
 */


public class Task1 {
    public static void main(String[] args) {
        String regex = "^([A-Za-z])(\\w*)(@)(\\w*){3,}(\\.)([com]|[org])+$";

        String email1 = "vasya_1444@gmail.com";
        String email2 = "11vasya_1444@gmail.com";
        String email3 = "vasya_1444@gmail.ru";
        String email4 = "va!!sya_14!!44@gm_ail.com";
        String email5 = "Vasya_1444@gmail.org";
        String email6 = "_vasya_1444@gmail.com";

        System.out.println(Pattern.matches(regex, email1));
        System.out.println(Pattern.matches(regex, email2));
        System.out.println(Pattern.matches(regex, email3));
        System.out.println(Pattern.matches(regex, email4));
        System.out.println(Pattern.matches(regex, email5));
        System.out.println(Pattern.matches(regex, email6));
    }
}
