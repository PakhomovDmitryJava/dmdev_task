package lesson7.task;

/**
 * 3. Написать метод equals, который определяет, равны ли между собой соответствующие элементы
 * 2-х двумерных массивов.
 */
public class Task3 {
    public static void main(String[] args) {
        int[][] values1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] values2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        equals(values1, values2);
    }

    public static void equals(int[][] arrays1, int[][] arrays2) {
        if (arrays1.length != arrays2.length) {
            System.out.println("Arrays aren't equal!");
        } else {
            for (int i = 0; i < arrays1.length; i++) {
                int[] ints1 = arrays1[i];
                int[] ints2 = arrays2[i];
                if (ints1.length != ints2.length) {
                    System.out.println("Arrays aren't equal!");
                } else {
                    for (int j = 0; j < ints1.length; j++) {
                        if (ints1[j] == ints2[j]) {
                            System.out.println("Elements [" + i + "][" + j + "] of arrays are equal");
                        } else {
                            System.out.println("Elements [" + i + "][" + j + "] of arrays aren't equal");
                        }
                    }
                }
            }
        }
    }
}
