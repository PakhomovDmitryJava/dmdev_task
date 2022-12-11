package hometask12;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Существует две постоянно соревнующиеся расы: маги огня и маги воздуха.
 * Их задача - как можно быстрее набрать 500 красных и 500 белых кристаллов.
 * Кристаллы растут на другой планете с рандомной скоростью от 2 до 5 рандомных кристаллов в сутки (может быть 1 красный и 2 белых, а может и вовсе все 4 кристалла красного цвета).
 * Маги огня и маги воздуха отправляют раз в сутки по ракете за добычей кристаллов.
 * Каждая ракета может погрузить на борт от 2 до 5 рандомных кристаллов.
 * Если кристаллов нет - ракета улетает пустой.
 * Написать программу, которая симулирует процесс заполнения кристаллов у магов огня и воздуха.
 * Для симуляции принять, что и кристаллы создаются, и ракеты прилетают в одно и то же время - полночь.
 * Соревнование заканчивается, когда какая-то раса соберет необходимые кристаллы.
 */
public class CrystalRunner {
    public static void main(String[] args) {

        Queue<Crystal> queue = new LinkedBlockingQueue<>();
        AtomicBoolean isNotFull = new AtomicBoolean(true);
        Thread crystalProducer  = new Thread(new CrystalProducer(queue,1000, isNotFull));
        Thread redConsumer = new Thread(new RedCrystalConsumer(queue,100, isNotFull));
        Thread whiteConsumer = new Thread(new WhiteCrystalConsumer(queue,100,isNotFull));

        crystalProducer.start();
        whiteConsumer.start();
        redConsumer.start();
    }
}
