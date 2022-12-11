package oop.lesson1;

public class TestExample {
    public static void main(String[] args) {
     int value = 10;
     int[] values = {value, 1,2,3,4,5};
     printArray(values);
    }

    private static void printArray(int[] values) {
        for (int value : values) {
            System.out.println(value);
        }
    }

}
