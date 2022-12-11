package oop.lesson19.treemap;

import oop.lesson19.person.Person;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Petr", "Petrov");
        Person sveta = new Person(32, "Sveta", "Svetova");
        Person dima = new Person(4, "Dima", "Dimov");
        Person pavel = new Person(65, "Pavel", "Pavlov");
        Person roman = new Person(3, "Roman", "Romanov");

        Map<Integer, Person> map = new TreeMap<>();
        map.put(ivan.getId(),ivan);
        map.put(petr.getId(), petr);
        map.put(sveta.getId(), sveta);
        map.putIfAbsent(dima.getId(),dima);
        map.putIfAbsent(pavel.getId(),pavel);
        map.putIfAbsent(roman.getId(),roman);

        for (Map.Entry<Integer,Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}
