package lesson7.hometask;

/**
 * Написать функцию linearize, которая принимает в качестве параметра двумерный массив
 * и возвращает одномерный массив со всеми элементами двумерного.
 */
public class Hometask4 {
    public static void main(String[] args) {
        int[][] values1 = {
                {9, 8, 73, 23, 23, 23, 23, 23, 23, 23, 2},
                {6, 5, 4},
                {3, 2, 13, 23, 23, 2},
                {3, 2, 13, 2},
                {3, 2, 1, 3, 23, 2}
        };
        int[] result = linearize(values1);
        Hometask1.printArray(result);
    }

    public static int[] linearize(int[][] arrays) {
        int[] result;
        int arrayLength = 0;
        for (int[] array : arrays) {
            arrayLength += array.length;
        }
        result = new int[arrayLength];
        for (int i = 0, k = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                result[k++] = arrays[i][j];
            }
        }
        return result;

    }
}
