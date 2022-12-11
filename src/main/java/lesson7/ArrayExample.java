package lesson7;

public class ArrayExample {
    public static void main(String[] args) {
        int[] values = new int[10];
        System.out.println(values[5]);
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

    }

    private static void test() {
        int value = 10;
        //              0  1  2  3  4  5  6  7  8  9
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(values[2]);

        values[3] = 18;
        System.out.println(values[3]);
    }
}
