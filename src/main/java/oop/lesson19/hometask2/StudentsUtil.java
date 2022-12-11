package oop.lesson19.hometask2;

import java.util.Comparator;
import java.util.List;

/**
 * Создать класс Student, представляющий собой ученика.
 * Добавить ему данные об имени, фамилии, возрасте и среднем балле за год.
 * Создать список (List) учеников. Найти и вывести ученика с самым высоким средним баллом используя итератор.
 * Отсортировать и вывести список учеников по полному имени (имя + фамилия), возрасту и среднему баллу, используя компараторы.
 */
public final class StudentsUtil {

    public StudentsUtil() {
    }

    public static Student getTheBestStudent(List<Student> students) {
        Student theBestStudent = null;
        for (Student student : students) {
            if (theBestStudent == null || theBestStudent.getAverageMark() < student.getAverageMark()) {
                theBestStudent = student;
            }
        }
        return theBestStudent;
    }

    public static List<Student> nameAndLastNameSort(List<Student> students) {
        students.sort(Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName));
        return students;
    }

    public static List<Student> ageSort(List<Student> students) {
        students.sort(Comparator.comparing(Student::getAge));
        return students;
    }

    public static List<Student> averageMarkSort(List<Student> students) {
        students.sort(Comparator.comparing(Student::getAverageMark));
        return students;
    }
}