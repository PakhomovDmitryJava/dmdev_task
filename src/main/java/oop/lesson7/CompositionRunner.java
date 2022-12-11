package oop.lesson7;

public class CompositionRunner {
    public static void main(String[] args) {
        Ram ram = new Ram(1024);
        Ssd ssd = new Ssd(2048);
        Computer computer = new Computer(ram, ssd);
        computer.printState();

        Computer computer1 = new Computer(null, null);
        Computer computer2 = new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        System.out.println(Computer.getCounter());

        Class<? extends Computer> clazz1 = computer1.getClass();
        Class<? extends Computer> clazz2 = computer2.getClass();
        System.out.println(clazz1 == clazz2);
        System.out.println(computer1 == computer2);
    }
}
