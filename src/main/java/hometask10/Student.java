package hometask10;

import java.util.List;
import java.util.Objects;

/**
 * Дан список студентов с полями:
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу
 * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
 * 1. Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
 * 2. Список студентов данного курса, но только с полями Имя и Фамилия.
 * 3. Список должен быть отсортированы по этим двум полям
 * Объект с двумя полями:
 * - Отсортированный список студентов с пункта 2
 * - Средняя оценка этих студентов
 * Подумать, как ассоциативный массив можно было представить в коде в виде отсортированного - TreeMap
 */
public class Student {
    private int course;
    private final String firstName;
    private final String lastName;
    private List<Integer> scores;

    public Student(int course, String firstName, String lastName, List<Integer> scores) {
        this.course = course;
        this.firstName = firstName;
        this.lastName = lastName;
        this.scores = scores;
    }
    public double getAverageScore() {
        return scores
                .stream()
                .mapToInt(score -> score)
                .average()
                .getAsDouble();
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", scores=" + scores +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(scores, student.scores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course, firstName, lastName, scores);
    }

    public int getCourse() {
        return course;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Integer> getScores() {
        return scores;
    }

}
