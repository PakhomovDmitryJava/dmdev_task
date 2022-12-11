package hometask7;

public abstract class Planet extends SpaceObject   {
    private boolean isInhabited;

    public Planet(String name, long mass, long radius, boolean isInhabited) {
        super(name, mass, radius);
        this.isInhabited = isInhabited;
    }

//скорость вращения

    public void armageddon(Meteoroid meteoroid) {
        if (meteoroid.getRadius() > 10000 && isInhabited) {
            this.isInhabited = false;
            System.out.println("A giant meteorite fell on the planet. All life is destroyed.");
        }
    }

    @Override
    public String toString() {
        return "Planet{" +
                "isInhabited=" + isInhabited +
                ", name='" + getName() + '\'' +
                ", mass=" + getMass() +
                ", radius=" + getRadius() +
                '}';
    }

    public boolean isInhabited() {
        return isInhabited;
    }

    public void setInhabited(boolean inhabited) {
        isInhabited = inhabited;
    }


}
