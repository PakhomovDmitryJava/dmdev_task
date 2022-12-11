package oop.lesson19.hometask4;

import java.util.HashMap;
import java.util.Objects;

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
public class Garage {
    private HashMap<Car, Integer> carMap;

    public Garage(HashMap<Car, Integer> carMap) {
        this.carMap = carMap;
    }

    public void parkCar(Car car) {
        if (carMap.containsKey(car)) {
            carMap.put(car, carMap.get(car) + 1);
        } else {
            carMap.put(car, 1);
        }
        System.out.println(car.getBrand() + " " + car.getModel() +
                " was parked in the garage!");
    }

    public void exitCar(Car car) {
        if (carMap.containsKey(car)) {
            if (carMap.get(car) == 0) {
                System.out.println("There is no any " + car.getBrand() + " " + car.getModel() + " in the garage!");
            } else {
                carMap.put(car, carMap.get(car) - 1);
                System.out.println(car.getBrand() + " " + car.getModel() +
                        " leaved the garage!");
            }
        } else {
            System.out.println("There is no any " + car.getBrand() + " " + car.getModel() + " in the garage!");
        }
    }

    public int carCounter(Car car) {
        return carMap.getOrDefault(car, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return Objects.equals(carMap, garage.carMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carMap);
    }

    @Override
    public String toString() {
        return "Garage{" +
                "carMap=" + carMap +
                '}';
    }

    public HashMap<Car, Integer> getCarMap() {
        return carMap;
    }

    public void setCarMap(HashMap<Car, Integer> carMap) {
        this.carMap = carMap;
    }
}
