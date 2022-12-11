package oop.lesson19;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListRunner {
    public static void main(String[] args) {
//        List<Integer> integers = new LinkedList<>(6);
//        integers.add(1);
//        integers.add(2);
//        integers.add(3);
//        integers.add(4);
//        integers.add(5);
//        integers.add(6);
//
//
//        System.out.println(integers.get(5));
//        System.out.println(integers.contains(4));
//        System.out.println(integers.contains(100));

        List <Integer> list1 = List.of(1,2,3,4,5,6);
        for (Integer next : list1) {
            System.out.println(next);
        }
    }
}
