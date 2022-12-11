package hometask4;

import java.util.Arrays;

public class Floor {
    private int number;
    private Apartment[] apartments;

    public Floor(int number, Apartment[] apartments) {
        this.number = number;
        this.apartments = apartments;
    }

    public Floor() {
    }

    public void print() {
        System.out.println("Floor number is " + number + ", "
                + "number of apartments is " + apartments.length);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Floor floor = (Floor) o;

        if (number != floor.number) return false;
        return Arrays.equals(apartments, floor.apartments);
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + Arrays.hashCode(apartments);
        return result;
    }
}
