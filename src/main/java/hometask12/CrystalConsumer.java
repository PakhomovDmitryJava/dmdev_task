package hometask12;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class CrystalConsumer implements Runnable {
    Queue<Crystal> queue;
    int capacity;
    AtomicBoolean finish;

    public CrystalConsumer(Queue<Crystal> queue, int capacity, AtomicBoolean finish) {
        this.queue = queue;
        this.capacity = capacity;
        this.finish = finish;
    }
    @Override
    public void run() {
    }
}
