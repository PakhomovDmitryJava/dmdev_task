package hometask2;

import java.util.Scanner;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */
public class HometaskAlone21 {
    public static void main(String[] args) {
        countOddNumbers();
        countEvenNumbers();
    }

    public static void countOddNumbers() {
        int number = consoleInputReader();
        int counter = 0;
        while (number != 0) {
            if (((number % 10) % 2) == 0) {
                int oddNumber = number % 10;
                System.out.print(oddNumber + " ");
                counter++;
            }
            number /= 10;
        }
        System.out.println("\nThe value of odd numbers is: " + counter);
    }

    public static void countEvenNumbers() {
        int number = consoleInputReader();
        int counter = 0;
        while (number != 0) {
            if (((number % 10) % 2) != 0) {
                int evenNumber = number % 10;
                System.out.print(evenNumber + " ");
                counter++;
            }
            number /= 10;
        }
        System.out.println("\nThe value of even numbers is: " + counter);
    }

    public static int consoleInputReader() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number. The number mustn't be equal to zero!");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("The number mustn't be equal to zero! Input correct number.");
            number = scanner.nextInt();
        }
        return number;
    }
}
