package lesson6.task;

/**
 * 2. Имеется число. Посчитать сумму цифр данного числа.
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(sumOfNumbers(123456));
        System.out.println(sumOfNumbersFor(123456));
    }

    public static int sumOfNumbers(int value) {
        int result = 0;
        int currentValue = value;
        while (currentValue != 0) {
            result += currentValue % 10;
            currentValue /= 10;
        }
        return result;
    }

    public static int sumOfNumbersFor(int value) {
        int result = 0;
        for (int currentValue = value; currentValue != 0; currentValue /= 10) {
            result += currentValue % 10;
        }
        return result;
    }
}
