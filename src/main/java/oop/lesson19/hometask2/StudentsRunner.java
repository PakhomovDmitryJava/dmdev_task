package oop.lesson19.hometask2;

import java.util.Arrays;
import java.util.List;

/**
 * Создать класс Student, представляющий собой ученика.
 * Добавить ему данные об имени, фамилии, возрасте и среднем балле за год.
 * Создать список (List) учеников. Найти и вывести ученика с самым высоким средним баллом используя итератор.
 * Отсортировать и вывести список учеников по полному имени (имя + фамилия), возрасту и среднему баллу, используя компараторы.
 */
public class StudentsRunner {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Ivan", "Ivanov", 15, 4.6),
                new Student("Petr", "Petrov", 13, 4.2),
                new Student("Sveta", "Svetova", 14, 3.5),
        new Student("Sveta", "Svetova", 6, 3.5),
        new Student("Sveta", "Svetova", 67, 2.2),
                new Student("Ashot", "Ashot", 67, 2.2),
        new Student("Ashot", "Bishot", 12,2.2));

        System.out.println(StudentsUtil.getTheBestStudent(students));
        System.out.println(StudentsUtil.nameAndLastNameSort(students));
        System.out.println(StudentsUtil.ageSort(students));
        System.out.println(StudentsUtil.averageMarkSort(students));
    }
}
