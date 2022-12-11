package hometask12;

import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicBoolean;

public class CrystalProducer implements Runnable {
    private final Queue<Crystal> queue;
    public final int capacity;
    private int totalRedCounter = 0;
    private int totalWhiteCounter = 0;
    private int counter = 0;
    private AtomicBoolean finish;

    public CrystalProducer(Queue<Crystal> queue, int capacity, AtomicBoolean finish) {
        this.queue = queue;
        this.capacity = capacity;
        this.finish = finish;
    }

    @Override
    public void run() {

        System.out.println("Crystal producer started!");
        while (counter < capacity && finish.get()) {
            synchronized (queue) {
                int totalCrystalCount = ThreadLocalRandom.current().nextInt(2, 5);
                int redCrystalCount = ThreadLocalRandom.current().nextInt(0, totalCrystalCount);
                for (int i = 0; i < redCrystalCount; i++) {
                    queue.offer(new Crystal(CrystalColorEnum.RED));
                    counter++;
                    totalRedCounter++;
                }

                for (int i = 0; i < totalCrystalCount - redCrystalCount; i++) {
                    queue.offer(new Crystal(CrystalColorEnum.WHITE));
                    counter++;
                    totalWhiteCounter++;
                }
                System.out.println(queue);
                System.out.format("Crystal producer create %s red and %s white crystals! Total colors count: red - %s, white - %s, all - %s.\n", redCrystalCount, totalCrystalCount - redCrystalCount, totalRedCounter, totalWhiteCounter, counter);
                synchronized (this) {
                    try {
                       wait(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (counter>=capacity){
                        finish.getAndSet(false);
                    }
                }
            }
        }
        System.out.println("\nCrystal producer finished!");

    }

}
