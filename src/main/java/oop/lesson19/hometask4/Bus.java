package oop.lesson19.hometask4;

import java.util.Objects;

public class Bus extends Car {
    private int passengersSeat;

    public Bus(String brand, String model, int year, int horsPower, double engineCapacity,int passengersSeat) {
        super(brand, model, year, horsPower, engineCapacity);
        this.passengersSeat = passengersSeat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return passengersSeat == bus.passengersSeat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersSeat);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passengersSeat=" + passengersSeat +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", horsPower=" + horsPower +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public int getPassengersSeat() {
        return passengersSeat;
    }

    public void setPassengersSeat(int passengersSeat) {
        this.passengersSeat = passengersSeat;
    }
}
