package hometask4;

import java.util.Arrays;

public class Apartment {
    private int number;
    private Room[] rooms;

    public Apartment(int number, Room[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public Apartment() {
    }

    public void print() {
        System.out.println("Apartment number is " + number + ", "
                + "number of rooms is " + rooms.length);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Apartment apartment = (Apartment) o;

        if (number != apartment.number) return false;
        return Arrays.equals(rooms, apartment.rooms);
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + Arrays.hashCode(rooms);
        return result;
    }
}
