package oop.lesson21;

import java.util.Optional;
import java.util.stream.Stream;

public class MapReduceExample {
    /**
     * 1000000 -> age -> max
     * 1000000 -> age -> max -> max
     * 1000000 -> age -> max
     */
    public static void main(String[] args) {
        Optional<Student> maybeStudent = Stream.of(
                        new Student(18, "Ivan1"),
                        new Student(32, "Ivan2"),
                        new Student(54, "Ivan3"),
                        new Student(65, "Ivan4"),
                        new Student(12, "Ivan5"),
                        new Student(55, "Ivan6"),
                        new Student(76, "Ivan7"),
                        new Student(43, "Ivan8"),
                        new Student(101, "Ivan9")
                )
                .sequential()
//                .map(Student::getAge)
//                .filter(student -> student.getAge() < 18)
                .reduce((student, student2) -> student.getAge() > student2.getAge() ? student : student2);
//        maybeStudent.ifPresent(System.out::println);
        maybeStudent.map(Student::getAge)
//                .filter(age -> age > 25)
                .flatMap(age -> Optional.ofNullable(age * 2))
                .ifPresent(System.out::println);


    }
}
