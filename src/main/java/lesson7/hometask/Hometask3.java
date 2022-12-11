package lesson7.hometask;

/**
 * Заданы 2 массива целых чисел произвольной длины.
 * Написать программу, создающую третий массив, представляющий собой слияние 2-х заданных.
 * Пример:
 * 1-й массив: {1, 2, 3, 4, 5}
 * 2-й массив: {5, 6, 7}
 * Результат: {1, 5, 2, 6, 3, 7, 4, 5}
 */
public class Hometask3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 6, 7};
        mergingOfArrays(array1,array2);
        System.out.println();
        Hometask1.printArray(mergeArrays(array1, array2));
    }

    public static void mergingOfArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int endOfArray = array1.length;

        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            result[i + endOfArray] = array2[i];
        }

        Hometask1.printArray(result);
    }
    private static int[] mergeArrays(int[] values1, int[] values2) {
        int[] resultArray = new int[values1.length + values2.length];
        for (int i = 0, index1 = 0, index2 = 0; i < resultArray.length; ) {
            if (index1 < values1.length && index2 < values2.length) {
                resultArray[i++] = values1[index1++];
                resultArray[i++] = values2[index2++];
            } else if (index1 < values1.length) {
                resultArray[i++] = values1[index1++];
            } else {
                resultArray[i++] = values2[index2++];
            }
        }

        return resultArray;
    }
}
