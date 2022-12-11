package hometask4;

public class Room {
    private boolean walkTrough;

    public Room(boolean walkTrough) {
        this.walkTrough = walkTrough;
    }

    public Room() {
    }

    public void print() {
        if (walkTrough) {
            System.out.println("This room is walk-through!");
        } else {
            System.out.println("This room is NOT walk-through!");
        }
    }

    public boolean isWalkTrough() {
        return walkTrough;
    }

    public void setWalkTrough(boolean walkTrough) {
        this.walkTrough = walkTrough;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        return walkTrough == room.walkTrough;
    }

    @Override
    public int hashCode() {
        return (walkTrough ? 1 : 0);
    }
}
