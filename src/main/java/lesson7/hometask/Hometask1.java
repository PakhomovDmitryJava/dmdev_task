package lesson7.hometask;

/**
 * Напишите программу, которая циклически сдвигает элементы массива вправо на одну позицию, и печатает результат.
 * Цикличность означает, что последний элемент массива становится самым первым его элементом.
 */
public class Hometask1 {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        arrayShift(values);
    }

    public static void arrayShift(int[] array) {
        printArray(array);
        int[] resultArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i + 1  > array.length - 1) {
                resultArray[0] = array[array.length - 1];
            } else {
                resultArray[i + 1] = array[i];
            }

        }
        System.out.println();
        printArray(resultArray);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
