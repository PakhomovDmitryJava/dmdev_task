package hometask12;

import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicBoolean;

public class WhiteCrystalConsumer extends CrystalConsumer {

    private int counter = 0;

    public WhiteCrystalConsumer(Queue<Crystal> queue, int capacity, AtomicBoolean finish) {
        super(queue, capacity, finish);
    }

    @Override
    public void run() {
        while (counter < capacity && finish.get()) {
            synchronized (queue) {
                for (int i = 0; i < ThreadLocalRandom.current().nextInt(2, 5); i++) {
                    if (!queue.isEmpty()) {
                        Crystal crystal = queue.poll();
                        if (Objects.requireNonNull(crystal).getColor() == CrystalColorEnum.WHITE) {
                            System.out.println("Got white crystal!");
                            counter++;
                        } else {
                            System.out.println("Didn't find a white crystal!");
                        }
                    }
                }
                System.out.println("Founded " + counter + " white crystals!");
                try {
                    queue.wait(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (counter >= capacity) {
                    finish.getAndSet(false);
                }
            }
        }
        System.out.println("White consumer is full!");
    }
}
