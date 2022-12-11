package oop.lesson19.map;

import oop.lesson19.person.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Petr", "Petrov");
        Person sveta = new Person(3, "Sveta", "Svetova");

//        System.out.println(ivan.hashCode());
//        System.out.println(petr.hashCode());
//        System.out.println(ivan.equals(petr));

        Map<Integer, Person> map = new HashMap<>();
        map.put(ivan.getId(),ivan);
        map.put(petr.getId(), petr);
        map.put(sveta.getId(), sveta);

        System.out.println(map.containsKey(1));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get(6));
        System.out.println(map.getOrDefault(6, sveta));
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.entrySet());
//
//        for (Person person :
//                map.values()) {
//            System.out.println(person.getFirstName());
//        }
//        for (Map.Entry<Integer, Person> entry : map.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getKey());
//
//        }
    }

}
