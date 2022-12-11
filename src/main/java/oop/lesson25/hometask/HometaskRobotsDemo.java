package oop.lesson25.hometask;

import java.util.List;

/**
 * Двое безумных учёных устроили соревнование, кто из них соберёт больше роботов за 100 ночей.
 * Для этого каждую ночь каждый из них отправляет своего прислужника на свалку фабрики роботов за деталями.
 * Чтобы собрать одного робота им нужно:
 * Голова, Тело, Левая рука, Правая рука, Левая нога, Правая нога, CPU, RAM, HDD.
 * В первую ночь на свалке находится 20 случайных деталей.
 * Каждую ночь фабрика выбрасывает на свалку от 1 до 4 случайных деталей.
 * В то же самое время прислужники обоих учёных отправляются на свалку, и каждый собирает от 1 до 4 случайных деталей.
 * Если на свалке деталей нет – прислужник уходит ни с чем.
 * Затем они возвращаются домой и отдают детали хозяевам.
 * Учёные пытаются собрать как можно больше роботов из деталей, которые они получили.
 * Написать программу, симулирующую этот процесс.
 * Для симуляции принять, что каждая ночь наступает через 100мс.
 * Фабрика и два прислужника действуют в одно и то же время.
 * После 100 ночей (около 10 секунд) определить победителя соревнования
 */
public class HometaskRobotsDemo {
    public static void main(String[] args) {
        List<RobotDetails> robotDetailsFromJunkyard = RandomDetailsUtil.getFirstNightDetails();
        System.out.println(robotDetailsFromJunkyard.size());
        Thread producerThread = new Thread(new ProducerRobotDetailsThread(robotDetailsFromJunkyard));
        Thread consumerThreadFirstScientist = new Thread(new ConsumerRobotDetailsThread(robotDetailsFromJunkyard));
        Thread consumerThreadSecondScientist = new Thread(new ConsumerRobotDetailsThread(robotDetailsFromJunkyard));

        producerThread.start();
        consumerThreadFirstScientist.start();
        consumerThreadSecondScientist.start();


        try {
            producerThread.join();
            consumerThreadFirstScientist.join();
            consumerThreadSecondScientist.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

