package lesson6.hometask;

/**
 * Написать программу, вычисляющую и отображающую все числа Фибоначчи,
 * которые меньше введённого пользователем целого числа.
 * Решить двумя способами: с помощью цикла и с помощью рекурсии.
 */
public class Hometask2 {
    public static void main(String[] args) {
//        fibonacci(18000);
        printFibonacciRecursion(100);
    }

    public static void fibonacci(int value) {
        int result1 = 0;
        int result2 = 1;
        int result3;
        System.out.print(result1 + " ");
        System.out.print(result2 + " ");
        while (result1 + result2 < value) {
            result3 = result1 + result2;
            System.out.print(result3 + " ");
            result1 = result2;
            result2 = result3;
        }
    }

    public static void printFibonacciRecursion(int value) {
        int first = 0;
        int second = 1;
        System.out.print(first + " ");
        fibonacciRecursion(first, second, value);
    }

    public static void fibonacciRecursion(int first, int second, int value) {
        if (second < value) {
            System.out.print(second + " ");
            fibonacciRecursion(second, first + second, value);
        }

    }
}
