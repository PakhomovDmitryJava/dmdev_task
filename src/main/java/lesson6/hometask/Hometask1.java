package lesson6.hometask;
/**
 * Написать программу, вычисляющую сумму цифр введённого
 * пользователем целого числа.
 */

public class Hometask1 {
    public static void main(String[] args) {
        System.out.println(sum(123456));
    }

    public static int sum(int value) {
        int result = 0;
        int currentValue = value;
        while (currentValue > 0) {
            result = result + currentValue % 10;
            currentValue /= 10;
        }
        return result;
    }

}
