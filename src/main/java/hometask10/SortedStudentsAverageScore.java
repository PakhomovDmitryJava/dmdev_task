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
 * 1. Средняя оценка студентов этого курса, количество оценок у которых больше 3-х;
 * 2. Список студентов данного курса, но только с полями Имя и Фамилия. Список должен быть отсортированы по этим двум полям;
 * 3. Объект с двумя полями:
 * - Отсортированный список студентов с пункта 2
 * - Средняя оценка этих студентов
 * Подумать, как ассоциативный массив можно было представить в коде в виде отсортированного - TreeMap
 */
public class SortedStudentsAverageScore {
    private List<Student> sortedListFullNames;
    private double averageScoreOfList;

    public SortedStudentsAverageScore(List<Student> sortedListFullNames, double averageScoreOfList) {
        this.sortedListFullNames = sortedListFullNames;
        this.averageScoreOfList = averageScoreOfList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SortedStudentsAverageScore that = (SortedStudentsAverageScore) o;
        return Double.compare(that.averageScoreOfList, averageScoreOfList) == 0 && Objects.equals(sortedListFullNames, that.sortedListFullNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sortedListFullNames, averageScoreOfList);
    }

    @Override
    public String toString() {
        return "StudentAverageScore{" +
                "sortedListFullNames=" + sortedListFullNames +
                ", averageScoreOfList=" + averageScoreOfList +
                '}';
    }

    public List<Student> getSortedListFullNames() {
        return sortedListFullNames;
    }

    public void setSortedListFullNames(List<Student> sortedListFullNames) {
        this.sortedListFullNames = sortedListFullNames;
    }

    public double getAverageScoreOfList() {
        return averageScoreOfList;
    }

    public void setAverageScoreOfList(double averageScoreOfList) {
        this.averageScoreOfList = averageScoreOfList;
    }
}
