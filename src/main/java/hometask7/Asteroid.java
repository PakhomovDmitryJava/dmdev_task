package hometask7;

public class Asteroid extends Meteoroid {
    private Star starOrbit;

    public Asteroid(String name, long mass, long radius, Star starOrbit) {
        super(name, mass, radius);
        this.starOrbit = starOrbit;
    }

    public String getStarOrbit() {
        return starOrbit.getName();
    }

    public void setStarOrbit(Star starOrbit) {
        this.starOrbit = starOrbit;
    }

    @Override
    public String toString() {
        return "Asteroid{" +
                "starOrbit=" + starOrbit +
                ", name='" + getName() + '\'' +
                ", mass=" + getMass() +
                ", radius=" + getRadius() +
                '}';
    }
}
