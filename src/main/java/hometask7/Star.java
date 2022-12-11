package hometask7;

public abstract class Star extends SpaceObject {
    private boolean isShining;

    public Star(String name, long mass, long radius, boolean isShining) {
        super(name, mass, radius);
        this.isShining = isShining;
    }


    public void starWinksOut() {
        this.isShining = false;
        System.out.println("The star went out. The galaxy is plunging into darkness.");
    }

    public boolean isShining() {
        return isShining;
    }

    public void setShining(boolean shining) {
        isShining = shining;
    }
    @Override
    public String toString() {
        return "Star{" +
                "isShining=" + isShining +
                ", name='" + getName() + '\'' +
                ", mass=" + getMass() +
                ", radius=" + getRadius() +
                '}';
    }
}
