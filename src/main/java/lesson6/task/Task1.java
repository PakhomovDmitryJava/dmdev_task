package lesson6.task;

/**
 * 1. Написать программу высчитывающую факториал введённого целого числа.
 */

public class Task1 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialWhile(6));
        System.out.println(factorialRecursion(7));
    }

    public static int factorialWhile(int value) {
        int i = 1;
        int result = 1;
        while (i <= value) {
            result = result * i;
            i++;
        }
        return result;
    }

    public static int factorial(int value) {
        int result = 1;
        for (int i = 1; i <= value ; i++) {
            result = result * i;
        }
        return result;
    }

    public static int factorialRecursion(int value) {
        if (value == 1) {
            return 1;
        }
        return value * factorialRecursion(value - 1);
    }
}
