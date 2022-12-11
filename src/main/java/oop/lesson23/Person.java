package oop.lesson23;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
    
    @Serial
    private static final long serialVersionUID = 1L;
    private int age;
    private transient String firstName;

    public Person(int age, String firstName) {
        this.age = age;
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
