package oop.lesson20;

/**
 * 2. Написать код, который создаст, а затем отловит
 * ArrayIndexOutOfBoundsException.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] ints = new int[10];
        try {
            System.out.println(ints[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("The element with this index doesn't exist!");
            e.printStackTrace();
        }
    }
}