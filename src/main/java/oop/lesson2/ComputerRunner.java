package oop.lesson2;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.printState();

        Computer computer1 = new Computer(2048);
        computer1.printState();

        Computer computer2 = new Computer(10000, 10000);
        computer2.printState();

        Computer computer3 = new Computer(2323, 2323);
        computer3.printState();
        computer3.load(true);
    }
}