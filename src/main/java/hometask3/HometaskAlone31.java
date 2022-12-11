package hometask3;

import lesson7.hometask.Hometask1;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы
 * (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для тестирования написанного функционала.
 */
public class HometaskAlone31 {
    public static void main(String[] args) {
        int[] numbers1 = {3, 5, -6, 3, 2, -9, 0, -123, 3, 5, -6, 3, 2, -9, 0, -1233, 5, -6, 3, 2, -9, 0, -1233, 5, -6, 3, 2, -9, 0, -123};
        Hometask1.printArray(createPositiveArray(numbers1));
        int[] numbers2 = {1,2,3,4,5,-1,-2};
        Hometask1.printArray(createPositiveArray(numbers2));
    }

    public static int countPositiveNumbers(int[] array) {
        int positiveNumbersCounter = 0;
        for (int i : array) {
            if (i >= 0) {
                positiveNumbersCounter++;
            }
        }
        return positiveNumbersCounter;
    }

    public static int[] createPositiveArray(int[] array) {
        int resultArrayLength = countPositiveNumbers(array);
        int[] result = new int[resultArrayLength];
        for (int i = 0, k = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                array[i] *= resultArrayLength;
                result[k++] = array[i];
            }
        }
        return result;
    }
}
