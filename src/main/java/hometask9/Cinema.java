package hometask9;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Даны 2 класса:
 * - Фильм с 5-ю полями: Уникальный Целочисленный идентификатор (id), Год издания, Месяц издания, Жанр и Рейтинг;
 * - Кинотеатр, где есть всего лишь одно единственное поле: отсортированный ассоциативный массив,
 * где ключом является год издания, а значением - все фильмы, выпустившиеся в этом году.
 * Добавить функционал в кинотеатр таким образом, чтобы можно было:
 * - добавлять в него новый фильм +
 * - получить все фильмы по переданному году +
 * - получить все фильмы по переданному году и месяцу +
 * - получить все фильмы по переданному жанру +
 * - получать ТОП-10 фильмов отсортированные по Рейтингу в порядке убывания +
 * Учесть следующее:
 * - в кинотеатре фильмы должны храниться в порядке их добавления в него (т.е. предусмотреть порядок значения ассоциативного массива)
 * - не должен добавляться фильм, если такой уже есть в кинотеатре
 * Продемонстрировать работу кинотеатра в отдельном классе.
 */
public class Cinema {
    private LinkedHashMap<Integer, ArrayList<Film>> filmsSortedByYear;

    public Cinema(LinkedHashMap<Integer, ArrayList<Film>> filmsSortedByYear) {
        this.filmsSortedByYear = filmsSortedByYear;
    }

    public Set<Film> getAllFilms() {
        Set<Film> allFilms = new HashSet<>();
        for (ArrayList<Film> films : filmsSortedByYear.values()) {
            allFilms.addAll(films);
        }
        return allFilms;
    }

    public void addNewFilm(Film film) {
        if (getAllFilms().contains(film)) {
            System.out.println("This film is already exist in the cinema!\n");
        } else if (!filmsSortedByYear.containsKey(film.getYear())) {
            ArrayList<Film> newFilms = new ArrayList<>(1);
            newFilms.add(film);
            filmsSortedByYear.put(film.getYear(), newFilms);
        } else {
            filmsSortedByYear.get(film.getYear()).add(film);
        }
    }

    public ArrayList<Film> getFilmsByYear(Integer year) {
        return filmsSortedByYear.get(year);
    }

    public ArrayList<Film> getFilmsByYearAndMonth(Integer year, String month) {
        ArrayList<Film> byYear = getFilmsByYear(year);
        ArrayList<Film> byYearAndMoth = new ArrayList<>();
        for (Film film : byYear) {
            if (Objects.equals(film.getMonth(), month)) {
                byYearAndMoth.add(film);
            }
        }
        return byYearAndMoth;
    }

    public ArrayList<Film> getFilmsByGenre(String genre) {
        ArrayList<Film> byGenre = new ArrayList<>();

        for (Map.Entry<Integer, ArrayList<Film>> entry : filmsSortedByYear.entrySet()) {
            for (Film film : entry.getValue()) {
                if (film.getGenre().equals(genre)) {
                    byGenre.add(film);
                }
            }
        }
        return byGenre;
    }

    public ArrayList<Film> getTop10FilmsByRating(int topLimit) {
        ArrayList<Film> allFilms = new ArrayList<>(getAllFilms());
        allFilms.sort(Comparator.comparing(Film::getRating).reversed());
        return new ArrayList<>(allFilms.subList(0, topLimit));
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema = (Cinema) o;
        return Objects.equals(filmsSortedByYear, cinema.filmsSortedByYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmsSortedByYear);
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "filmsForYear=" + filmsSortedByYear +
                '}';
    }

    public LinkedHashMap<Integer, ArrayList<Film>> getFilmsSortedByYear() {
        return filmsSortedByYear;
    }

    public void setFilmsSortedByYear(LinkedHashMap<Integer, ArrayList<Film>> filmsSortedByYear) {
        this.filmsSortedByYear = filmsSortedByYear;
    }
}

