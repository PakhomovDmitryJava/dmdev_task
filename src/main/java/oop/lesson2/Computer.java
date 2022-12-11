package oop.lesson2;

public class Computer {
    private int ssd = 512;
    private int ram;

    Computer() {
        System.out.println("I was created!");
    }

    Computer(int newSsd){
        ssd = newSsd;
    }
    Computer(int newSsd, int newRam){
        ssd = newSsd;
        ram = newRam;
    }

    void load() {
        System.out.println("I'm loaded!");
    }

    void load(boolean open) {
        System.out.println("I'm loaded!");
        if (open) {
            System.out.println("I opened the top!");
        }
    }

    void printState() {
        System.out.println("SSD: " + ssd);
        System.out.println("RAM: " + ram);
        System.out.println();
    }


}
