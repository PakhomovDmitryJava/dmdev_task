package oop.lesson10.task;

/**
 * 2. Написать функцию, принимающую 2 параметра: строку и слово - и
 * возвращающую true, если строка начинается и заканчивается этим словом.
 */
public class Task2 {
    public static void main(String[] args) {
        String string = "English, Motherfucker, do you speak it? English";
        String word = "English";
        System.out.println(isContainsWord(string, word));
    }

    public static boolean isContainsWord(String string, String word) {
        return string.startsWith(word) && string.endsWith(word);
    }
}
