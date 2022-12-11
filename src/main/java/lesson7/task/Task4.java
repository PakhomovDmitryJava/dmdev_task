package lesson7.task;

/**
 * 4. Определить сумму элементов целочисленного массива, расположенных между минимальным и максимальным значениями.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] numbers = {10, 2, 3, 100, 2, 2, 3, 4, 5, 6, 1, 2, 3, 4, 66, 78};
        System.out.println(calculateSumBetween(numbers));
    }

    public static int findMinIndex(int[] values) {
        int minValue = values[0];
        int minIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (minValue > values[i]) {
                minValue = values[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findMaxIndex(int[] values) {
        int maxValue = values[0];
        int maxIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (maxValue < values[i]) {
                maxValue = values[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int calculateSumBetween(int[] values) {
        int maxIndex = findMaxIndex(values);
        int minIndex = findMinIndex(values);
        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }
        int result = 0;
        for (int i = minIndex + 1; i < maxIndex; i++) {
            result += values[i];
        }
        return result;
    }
}
