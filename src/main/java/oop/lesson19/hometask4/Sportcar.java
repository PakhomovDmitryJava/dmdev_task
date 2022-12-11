package oop.lesson19.hometask4;

import java.util.Objects;

public class Sportcar extends Car {
    private double accelerationTo100;

    public Sportcar(String brand, String model, int year, int horsPower, double engineCapacity, double accelerationTo100) {
        super(brand, model, year, horsPower, engineCapacity);
        this.accelerationTo100 = accelerationTo100;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sportcar sportcar = (Sportcar) o;
        return Double.compare(sportcar.accelerationTo100, accelerationTo100) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), accelerationTo100);
    }

    @Override
    public String toString() {
        return "Sportcar{" +
                "accelerationTo100=" + accelerationTo100 +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", horsPower=" + horsPower +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public double getAccelerationTo100() {
        return accelerationTo100;
    }

    public void setAccelerationTo100(double accelerationTo100) {
        this.accelerationTo100 = accelerationTo100;
    }
}
