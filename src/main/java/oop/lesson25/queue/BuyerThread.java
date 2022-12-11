package oop.lesson25.queue;

import java.util.Queue;

public class BuyerThread implements Runnable {
    private final Queue<Cashbox> cashboxes;

    public BuyerThread(Queue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            synchronized (cashboxes) {
                while (true) {
                    if (!cashboxes.isEmpty()) {
                        Cashbox cashbox = cashboxes.remove();
                        System.out.println(Thread.currentThread().getName() + " uses  with a cashbox " + cashbox);

                        cashboxes.wait(5L);

                        System.out.println(Thread.currentThread().getName() + " leaves a cashbox " + cashbox);
                        cashboxes.add(cashbox);
                        cashboxes.notifyAll();
                    } else {
                        System.out.println(Thread.currentThread().getName() + " waits a cashbox.");
                        cashboxes.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
