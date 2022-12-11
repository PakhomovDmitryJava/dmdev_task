package oop.lesson19.map;

import oop.lesson19.person.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("123", "345", "14", "678", "9");
        Collections.sort(strings);
        System.out.println(strings);

        List<Person> people = Arrays.asList(
                new Person(1, "Ivan", "Ivanov"),
                new Person(2, "Petr", "Petrov"),
                new Person(3, "Sveta", "Svetova"));

        Collections.sort(people);
        System.out.println(people);

        people.sort(new FirstNameComparator());
        people.sort(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName));
        System.out.println(people);
    }

    public static class FirstNameComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }
}
