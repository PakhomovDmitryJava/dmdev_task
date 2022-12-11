package oop.lesson19.hometask4;

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
public abstract class Car {
     String brand;
     String model;
     int year;
     int horsPower;
     double engineCapacity;

    public Car(String brand, String model, int year, int horsPower, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.horsPower = horsPower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && horsPower == car.horsPower && Double.compare(car.engineCapacity, engineCapacity) == 0 && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, horsPower, engineCapacity);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", horsPower=" + horsPower +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsPower() {
        return horsPower;
    }

    public void setHorsPower(int horsPower) {
        this.horsPower = horsPower;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
