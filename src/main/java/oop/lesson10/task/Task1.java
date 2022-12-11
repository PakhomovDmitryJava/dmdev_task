package oop.lesson10.task;

/**
 * 1. Заменить все грустные смайлы :( в строке на весёлые :)
 */
public class Task1 {
    public static void main(String[] args) {
        String sadString = ":(((:(:(:(:(:(((( 123123 asdfasdf :)))))))))";
        replaceSadSmiles(sadString);
    }
    public static void replaceSadSmiles(String value) {
        System.out.println(value.replace('(',')'));
    }
}
