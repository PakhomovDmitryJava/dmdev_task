package hometask1;

/**
 * Даны 3 переменные:
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char '+’, '-’, '*’, '/’, '%’)
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = '+’
 * Результат: 34.5 (24.4 + 10.1)
 */

public class HometaskAlone12 {
    public static void main(String[] args) {
        System.out.println(calculation(232, 5, '+'));
        System.out.println(calculation(5, 10, '-'));
        System.out.println(calculation(1231.2323, 3333.3, '*'));
        System.out.println(calculation(6565, 0.5, '/'));
        System.out.println(calculation(6565, 0.5, '!'));
    }

    public static double calculation(double x, double y, char mathSign) {
       double result = 0;
        switch (mathSign) {
            case '+' -> result = x + y;
            case '-' -> result = x - y;
            case '*' -> result = x * y;
            case '/' -> result = x / y;
            default -> System.out.println("Wrong input!");
        }
        return result;
    }
}
