package oop.lesson21.task1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

/**
 * 5. Дан класс Person с полями firstName, lastName,
 * age.
 * Вывести полное имя самого старшего человека, у
 * которого длина этого имени не превышает 15
 * символов.
 */
public class Task5 {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Ivan1", "Ivanov1", 20),
                new Person("Ivan2", "Ivanov2", 21),
                new Person("Ivan3", "Ivanov3", 22),
                new Person("Ivan4", "Ivanov4", 23),
                new Person("Ivan5", "Ivanov5", 24)
        );
        persons.stream()
                .filter(person -> person.getFullName().length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);

        Map<Integer, List<String>> map = persons.stream()
                .collect(groupingBy(Person::getAge,
                        mapping(Person::getFullName, toList())));
        System.out.println(map);

        Map<Integer, Person> collect = persons.stream()
                .collect(toMap(Person::getAge, Function.identity()));
        System.out.println(collect);

    }
}
