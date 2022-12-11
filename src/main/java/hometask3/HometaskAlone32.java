package hometask3;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: ['a', '6', 'y', 'P', 'T', 'q', '9', '+'] -> [97, 54, 121, 80, 84, 113, 57, 43]
 *
 * Далее определить среднее арифметическое всех элементов целочисленного массива
 * и вывести на консоль только те элементы, которые больше этого среднего арифметического.
 */
public class HometaskAlone32 {
    public static void main(String[] args) {
        char[] letters = {'d', 'q', 'z', 'Q', 's', 'C', 'L', '!'};
        int[] results = transformToIntArray(letters);
        for (int result : results) {
            System.out.println(result);
        }
        System.out.println(findAverage(results));
        printBiggerThanAverage(results);
    }


    public static int[] transformToIntArray(char[] values) {
        int[] results = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            results[i] = values[i];
        }
        return results;
    }


    public static double findAverage(int[] array) {
        double arraySum = 0;
        for (int i : array) {
            arraySum += i;
        }
        return arraySum / array.length;

    }

    public static void printBiggerThanAverage(int[] array) {
        double average = findAverage(array);
        for (int result : array) {
            if (result > average) {
                System.out.print(result + " ");
            }
        }
    }
}


