package hometask7;

public abstract class Meteoroid extends SpaceObject {
    public Meteoroid(String name, long mass, long radius) {
        super(name, mass, radius);
    }

    @Override
    public String toString() {
        return "Meteoroid{" +
                "name='" + getName() + '\'' +
                ", mass=" + getMass() +
                ", radius=" + getRadius() +
                '}';
    }
}
