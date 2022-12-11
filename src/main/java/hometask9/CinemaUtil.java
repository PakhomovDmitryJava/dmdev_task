package hometask9;
/**
 * Даны 2 класса:
 * - Фильм с 5-ю полями: Уникальный Целочисленный идентификатор (id), Год издания, Месяц издания, Жанр и Рейтинг;
 * - Кинотеатр, где есть всего лишь одно единственное поле: отсортированный ассоциативный массив,
 * где ключом является год издания, а значением - все фильмы, выпустившиеся в этом году.
 * Добавить функционал в кинотеатр таким образом, чтобы можно было:
 * - добавлять в него новый фильм +
 * - получить все фильмы по переданному году
 * - получить все фильмы по переданному году и месяцу
 * - получить все фильмы по переданному жанру
 * - получать ТОП-10 фильмов отсортированные по Рейтингу в порядке убывания
 * Учесть следующее:
 * - в кинотеатре фильмы должны храниться в порядке их добавления в него (т.е. предусмотреть порядок значения ассоциативного массива)
 * - не должен добавляться фильм, если такой уже есть в кинотеатре
 * Продемонстрировать работу кинотеатра в отдельном классе.
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;

public final class CinemaUtil {
    private ArrayList<Film> films;

    public static LinkedHashMap<Integer, ArrayList<Film>> linkedHashMapFilms(ArrayList<Film> films) {
        LinkedHashMap<Integer, ArrayList<Film>> hashMap = new LinkedHashMap<>();
        ArrayList<ArrayList<Film>> sortedFilmsByYear = sortFilmsByYear(films);
        for (ArrayList<Film> sortedFilm : sortedFilmsByYear) {
            hashMap.put(sortedFilm.get(0).getYear(), sortedFilm);
        }
        return hashMap;
    }

    public static ArrayList<ArrayList<Film>> sortFilmsByYear(ArrayList<Film> films) {

        films.sort(Comparator.comparing(Film::getYear));
        ArrayList<ArrayList<Film>> results = new ArrayList<>(10);

        for (int i = 1, j = 0, k = 0; i < films.size(); i++) {
            if (i == films.size() - 1) {
                ArrayList<Film> filmsByYear = new ArrayList<>();
                filmsByYear.addAll(films.subList(j, films.size()));
                results.add(k, filmsByYear);
            } else if (films.get(i - 1).getYear() == films.get(i).getYear()) {
            } else if (films.get(i - 1).getYear() != films.get(i).getYear()) {
                ArrayList<Film> filmsByYear = new ArrayList<>();
                if (i == j) {
                    filmsByYear.add(films.get(i));
                    results.add(k, filmsByYear);
                } else {
                    filmsByYear.addAll(films.subList(j, i));
                    results.add(k, filmsByYear);
                }
                k++;
                j = i;
            }
        }
        return results;
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}

