package oop.lesson25.counter;

public class Counter {
    private static String description;
    private int counter;

    public static void init() {
        synchronized (Counter.class) {
            if (description == null) {
                description = "Test description";
            }
        }
    }

    public void increment() {
        synchronized (this) {
            counter++;
        }
    }

    public synchronized void decrement() {
        counter--;
    }

    public int getCounter() {
        return counter;
    }
}
