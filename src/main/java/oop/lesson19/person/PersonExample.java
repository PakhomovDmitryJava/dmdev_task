package oop.lesson19.person;

public class PersonExample {
    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan1", "Ivanov1");
        Person petr = new Person(1, "Ivan", "Ivanov");

        System.out.println(ivan.hashCode());
        System.out.println(petr.hashCode());
        System.out.println(ivan.equals(petr));


    }
}
