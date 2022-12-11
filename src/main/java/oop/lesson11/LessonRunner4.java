package oop.lesson11;

public class LessonRunner4 {
    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(123), new Ram(512));
        Laptop laptop1 = new Laptop(new Ssd(50000), new Ram(100000), 5);
        print(laptop,mobile, laptop1);
    }

    public static void print(Printable ... objects) {
        for (Printable object : objects) {
            object.print();
            System.out.println();
        }
    }
}
