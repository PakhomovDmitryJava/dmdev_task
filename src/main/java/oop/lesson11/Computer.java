package oop.lesson11;

public abstract class Computer implements Printable {
    private Ssd ssd;
    private Ram ram;

    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public Computer() {
    }

    @Override
    public void print() {
        System.out.println("SSD: " + ssd.getValue() + ", RAM: " + ram.getValue());
    }

    public abstract void load();

    public Ssd getSsd() {
        return ssd;
    }

    public void setSsd(Ssd ssd) {
        this.ssd = ssd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }
}
