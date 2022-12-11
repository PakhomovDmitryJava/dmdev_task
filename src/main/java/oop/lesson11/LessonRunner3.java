package oop.lesson11;

public class LessonRunner3 {
    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(123), new Ram(512));
        Laptop laptop1 = new Laptop(new Ssd(50000), new Ram(100000), 5);
//        loadComputers(laptop, mobile);
        printInformation(new Computer[]{laptop, mobile,laptop1});
    }

    public static void printInformation(Computer[] computers) {
        for (Computer computer : computers) {
            computer.print();
            if (computer instanceof Laptop laptop) {
                laptop.open();
            }
            System.out.println();
        }
    }

    public static void loadComputers(Computer... computers) {
        for (Computer computer : computers) {
            computer.load();
            System.out.println();
        }
    }
}
