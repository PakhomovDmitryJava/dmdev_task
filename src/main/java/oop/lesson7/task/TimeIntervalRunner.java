package oop.lesson7.task;

/**
 * Создать класс, описывающий промежуток времени.
 * Сам промежуток времени должен задаваться тремя свойствами:
 * секундами, минутами и часами.
 * Создать метод для получения полного количества секунд в объекте
 * Создать два конструктора: первый принимает общее количество
 * секунд, второй - часы, минуты и секунды по отдельности.
 * Создать метод для вывода данных.
 */
public class TimeIntervalRunner {
    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(21,10,40);
        timeInterval.currentTime();
        System.out.println(timeInterval.secondFinder(timeInterval));

        TimeInterval timeInterval1 = new TimeInterval(timeInterval.secondFinder(timeInterval));
        timeInterval1.currentTime();
    }
}
