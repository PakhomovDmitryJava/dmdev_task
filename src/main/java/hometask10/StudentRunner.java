package hometask10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class StudentRunner {
    public static void main(String[] args) {
        final int studentsCounter = 50;
        FistName[] fistNames = FistName.values();
        LastName[] lastNames = LastName.values();
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentsCounter; i++) {
            students.add(new Student(threadLocalRandom.nextInt(1, 6),
                    fistNames[threadLocalRandom.nextInt(0, 12)].toString(),
                    lastNames[threadLocalRandom.nextInt(0, 12)].toString(),
                    StudentUtil.getListOfRandomScores()));
        }

        students.forEach(System.out::println);
        System.out.println();

        Map<Integer, List<Student>> courseAverageScore = StudentUtil.sortStudentsByCoursesAndFullNames(students);
        courseAverageScore.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println();

        Map<Integer, Double> allAverageScore = StudentUtil.getAllAverageScore(students);
        allAverageScore.forEach((k,v) -> System.out.println(k + " - " + v));
        System.out.println();

        Map<Integer,List<Student>> fullNames = StudentUtil.getSortedListWithFullNames(students);
        fullNames.forEach((k,v) -> System.out.println(k + " - " + v));
        System.out.println();

    }
}
