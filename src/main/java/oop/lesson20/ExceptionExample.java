package oop.lesson20;

import java.io.FileNotFoundException;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("main ended");
        try {
            unsafe(10);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("main ended");
    }

    public static void unsafe(int value) throws FileNotFoundException {
        System.out.println("unsafe started");
        if (value > 0) {
            throw new FileNotFoundException();
        }
        System.out.println("unsafe ended");

    }
}
