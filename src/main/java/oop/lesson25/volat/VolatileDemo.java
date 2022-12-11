package oop.lesson25.volat;

public class VolatileDemo {
    private static volatile boolean flag = false;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (!flag) {
                System.out.println("Still false!");
            }
        });
        thread1.start();

        try {
            Thread.sleep(5L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Thread thread2 = new Thread(() -> {
            flag = true;
            System.out.println("Flag is set!");
        });
        thread2.start();

    }
}
