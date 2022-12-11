package oop.lesson19.hometask4;

import java.util.HashMap;

/**
 * Создать абстрактный класс Car, представляющий собой автомобиль.
 * Добавить в него поля: марка, модель, год выпуска + несколько своих.
 * Создать 4 класса, являющихся наследниками Car.
 * Переопределить во всех 3-х классах методы equals(), hashCode() и toString()
 * Создать класс Garage, хранящий в себе HashMap автомобилей,
 * в котором ключом является объект автомобиля, значением -
 * количество точно таких автомобилей в гараже.
 * Добавить в класс Garage методы для парковки, выезда авто,
 * а также для получения количества определенного вида автомобилей.
 * Продемонстрировать работу гаража.
 */
public class GarageRunner {
    public static void main(String[] args) {
        HashMap<Car, Integer> cars = new HashMap<>();
        Car paz = new Bus("PAZ", "3010", 2010, 200, 2460, 13);
        Car hybrid = new Hybrid("Toyota", "Prius PHV", 2017, 98, 1800, 25);
        Car sportcar = new Sportcar("Ferrari", "DAYTONA SP3", 2017, 840, 6496, 2.8);
        Car kamaz = new Truck("KAMAZ", "65802-87(S5)", 2017, 840, 6496, 24800);
        cars.put(paz, 50);
        cars.put(hybrid, 2);
        cars.put(sportcar, 1);
        cars.put(kamaz, 100);
        Garage garage = new Garage(cars);

        garage.parkCar(hybrid);
        System.out.println(garage.getCarMap().get(hybrid));

        garage.exitCar(sportcar);
        System.out.println(garage.getCarMap().get(sportcar));

        garage.exitCar(sportcar);
        System.out.println(garage.getCarMap().get(sportcar));

        System.out.println(garage.carCounter(paz));
        System.out.println(garage.carCounter(sportcar));
        System.out.println(garage.carCounter(hybrid));
        System.out.println(garage.carCounter(kamaz));

    }
}
