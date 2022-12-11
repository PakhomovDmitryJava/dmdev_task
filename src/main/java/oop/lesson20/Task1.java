package oop.lesson20;

/**
 * 1. Объявите переменную со значением null. Вызовите метод у этой
 * переменной. Отловите возникшее исключение.
 */
public class Task1 {
    public static void main(String[] args) throws NullPointerException {
        String value = null;
        try {
            value.length();
        } catch (NullPointerException e) {
            System.err.println("It's null!");
            e.printStackTrace();
        } finally {
            System.out.println("It's null!");
        }


    }
}
