package oop.lesson11;

public class Laptop extends Computer {
    private int weight;

    public Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
    }

    public Laptop() {
    }

    @Override
    public void load() {
        open();
        System.out.println("Loaded.");
    }

    public void open() {
        System.out.println("The laptop's cover is opened.");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Weight: " + getWeight());
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
