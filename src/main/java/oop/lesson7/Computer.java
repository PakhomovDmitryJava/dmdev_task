package oop.lesson7;

public class Computer {
    private Ram ram;
    private Ssd ssd;

    public static int counter = 0;

    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
        counter++;
    }

    public void printState() {
        System.out.println("Computer: RAM " + ram.getValue());
        System.out.println("Computer: SSD " + ram.getValue());
    }

    public static int getCounter() {
        return counter;
    }

}
