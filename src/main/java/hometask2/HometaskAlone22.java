package hometask2;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * Примечание: для решения может понадобиться функция возведение числа в степень: Math.pow(число, степень)
 */
public class HometaskAlone22 {
    public static void main(String[] args) {
        System.out.println(reverseNumber());
    }

    public static int reverseNumber() {
        int number = HometaskAlone21.consoleInputReader();
        int length = countDigits(number);
        int reversedNumber = 0;
        for (int i = 1; i <= length; i++) {
            reversedNumber = (int) (reversedNumber + (number % 10) * Math.pow(10, length - i));
            number /= 10;
        }
        return reversedNumber;
    }

    public static int countDigits(int number) {
        int length = 0;
        long temp = 1;
        while (temp <= number) {
            length++;
            temp *= 10;
        }
        return length;
    }
}
