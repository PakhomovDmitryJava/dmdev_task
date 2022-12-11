package oop.lesson19.hometask4;

import java.util.Objects;

public class Truck extends Car {
    private double loadCapacity;

    public Truck(String brand, String model, int year, int horsPower, double engineCapacity, double loadCapacity) {
        super(brand, model, year, horsPower, engineCapacity);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return Double.compare(truck.loadCapacity, loadCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", horsPower=" + horsPower +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
