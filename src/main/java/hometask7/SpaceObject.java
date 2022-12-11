package hometask7;

public abstract class SpaceObject implements Shining, Rotating {
    private String name;
    private long mass;
    private long radius;



    public SpaceObject(String name, long mass, long radius) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
    }

    public long diameter() {
        return radius * 2;
    }

    @Override
    public void shine() {
        System.out.println(this.name + " shining equals " + this.mass * this.radius * Math.random());
    }

    @Override
    public void rotate() {
        System.out.println(this.name + " rotating speed equals " + this.mass * this.radius * Math.random());

    }

    public void compareMass(SpaceObject spaceObject2) {
        if (this.getMass() > spaceObject2.getMass()) {
            System.out.println("The mass of " + this.getName() +
                    " is greater than the mass of " + spaceObject2.getName());
        } else if (this.getMass() == spaceObject2.getMass()) {
            System.out.println("These objects are equal!");
        } else if (this.getMass() < spaceObject2.getMass()) {
            System.out.println("The mass of " + spaceObject2.getName() +
                    " is greater than the mass of " + this.getName());
        }
    }

    public long getMass() {
        return mass;
    }

    public void setMass(long mass) {
        this.mass = mass;
    }

    public long getRadius() {
        return radius;
    }

    public void setRadius(long radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
