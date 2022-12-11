package lesson7.hometask;

/**
 * Написать программу, удаляющую все повторяющиеся целые числа из массива и печатающую результат.
 * Массив должен использоваться тот же самый. На место удаленных элементов ставить цифру 0.
 */
public class Hometask2 {
    public static void main(String[] args) {

        int[] values = {1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 8};
        cleaningArray(values);
    }

    public static void cleaningArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                array[i] = 0;
                array[i + 1] = 0;
            }
        }
        Hometask1.printArray(array);
    }
}
