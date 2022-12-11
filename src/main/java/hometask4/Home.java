package hometask4;

import java.util.Arrays;

public class Home {
    private int number;
    private Floor[] floors;

    public Home(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    public Home() {
    }

    public void print() {
        System.out.println("Home number is " + number + ", "
                + "number of apartments is " + floors.length);
    }

    public void printAllInformation() {
        this.print();
        for (Floor floor : floors) {
            floor.print();
            Apartment[] apartments = floor.getApartments();
            for (Apartment apartment : apartments) {
                apartment.print();
                Room[] rooms = apartment.getRooms();
                for (Room room : rooms) {
                    room.print();
                }
            }
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Home home = (Home) o;

        if (number != home.number) return false;
        return Arrays.equals(floors, home.floors);
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + Arrays.hashCode(floors);
        return result;
    }
}
