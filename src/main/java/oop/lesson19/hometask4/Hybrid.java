package oop.lesson19.hometask4;

import java.util.Objects;

public class Hybrid extends Car {
    private double batteryCapacity;

    public Hybrid(String brand, String model, int year, int horsPower, double engineCapacity, double batteryCapacity) {
        super(brand, model, year, horsPower, engineCapacity);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hybrid hybrid = (Hybrid) o;
        return Double.compare(hybrid.batteryCapacity, batteryCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCapacity);
    }

    @Override
    public String toString() {
        return "Hybrid{" +
                "batteryCapacity=" + batteryCapacity +
                '}';
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
