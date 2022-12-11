package oop.lesson11;

public class LessonRunner {
    public static void main(String[] args) {
        Ram ram = new Ram(1024);
        Ssd ssd = new Ssd(2048);
//        Computer computer = new Computer(ssd, ram);
//        computer.load();
        double sin = Math.sin(2.5);

        Laptop laptop = new Laptop( new Ssd(250),new Ram(512),2);
        laptop.load();
        laptop.open();

    }
}
