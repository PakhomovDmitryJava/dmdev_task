package lesson4;

/***
 * 2. Дано целое число. Определить, является ли последей цифрой
 * этого числа цифра 3.
 */
public class Task2 {
    public static void main(String[] args) {
        int number = 100;
        if (number % 10 == 3) {
            System.out.println("The last number is 3!");
        } else {
            System.out.println("The last number is NOT 3!");
        }
    }
}
