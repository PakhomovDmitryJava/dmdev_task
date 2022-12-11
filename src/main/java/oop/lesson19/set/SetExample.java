package oop.lesson19.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        new HashSet<>();
        new LinkedHashSet<>();
        new TreeSet<>();


        Set<String> set = new TreeSet<>();

        set.add("ccc");
        set.add("ddd");
        set.add("bbb");
        set.add("eee");
        set.add("aaa");
        set.add("bbb");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
