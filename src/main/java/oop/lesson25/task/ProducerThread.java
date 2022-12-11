package oop.lesson25.task;

import java.util.Queue;

/**
 * Задан LinkedList, представляющий собой хранилище целых чисел.
 * Поток ProducerThread c какой-то периодичностью бесконечно
 * добавляет в этот список случайные числа, однако максимальное количество,
 * которое он может добавить, равно 10.
 */
public class ProducerThread implements Runnable {
    private final Queue<Integer> list;

    public ProducerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (list.size() < 10) {
                    int random = RandomUtil.getRandom();
                    list.add(random);
                    System.out.println("producer adds value: " + random +
                            " List size = " + list.size());
                } else {
                    System.out.println("Producer does nothing!");
                }
//                list.notifyAll();
                try {
                    int random1 = 20;
                    list.wait(random1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
