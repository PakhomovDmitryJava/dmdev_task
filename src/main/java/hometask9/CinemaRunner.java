package hometask9;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Даны 2 класса:
 * - Фильм с 5-ю полями: Уникальный Целочисленный идентификатор (id), Год издания, Месяц издания, Жанр и Рейтинг;
 * - Кинотеатр, где есть всего лишь одно единственное поле: отсортированный ассоциативный массив,
 * где ключом является год издания, а значением - все фильмы, выпустившиеся в этом году.
 * Добавить функционал в кинотеатр таким образом, чтобы можно было:
 * - добавлять в него новый фильм
 * - получить все фильмы по переданному году
 * - получить все фильмы по переданному году и месяцу
 * - получить все фильмы по переданному жанру
 * - получать ТОП-10 фильмов отсортированные по Рейтингу в порядке убывания
 * Учесть следующее:
 * - в кинотеатре фильмы должны храниться в порядке их добавления в него (т.е. предусмотреть порядок значения ассоциативного массива)
 * - не должен добавляться фильм, если такой уже есть в кинотеатре
 * Продемонстрировать работу кинотеатра в отдельном классе.
 */
public class CinemaRunner {
    public static void main(String[] args) {
        Genre[] genres = Genre.values();
        Month[] months = Month.values();
        ArrayList<Film> films = new ArrayList<>();
        for (int i = 0; i < 100; i++) {

            Film newFilm = new Film(ThreadLocalRandom.current().nextInt() * 31,
                    ThreadLocalRandom.current().nextInt(2000, 2022),
                    months[ThreadLocalRandom.current().nextInt(0, 12)].toString(),
                    genres[ThreadLocalRandom.current().nextInt(0, 9)].toString(),
                    CinemaUtil.round(ThreadLocalRandom.current().nextDouble(5, 10), 2));
            films.add(newFilm);
        }
        Film newFilm1 = new Film(ThreadLocalRandom.current().nextInt() * 31, 2023, months[1].toString(), genres[1].toString(), 10);
        Film newFilm2 = new Film(ThreadLocalRandom.current().nextInt() * 31, 2023, months[2].toString(), genres[2].toString(), 10);
        Film newFilm3 = new Film(ThreadLocalRandom.current().nextInt() * 31, 2023, months[3].toString(), genres[3].toString(), 10);


        System.out.println(newFilm1 + "\n" + newFilm2 + "\n" + newFilm3 + "\n");


        Cinema cinema = new Cinema(CinemaUtil.linkedHashMapFilms(films));

        LinkedHashMap<Integer, ArrayList<Film>> hashMap1 = cinema.getFilmsSortedByYear();
        for (Map.Entry<Integer, ArrayList<Film>> entry : hashMap1.entrySet()) {
            System.out.println(entry.getKey());
            ArrayList<Film> filmsByYear = entry.getValue();
            for (Film film : filmsByYear) {
                System.out.println(film);
            }
        }

        cinema.addNewFilm(newFilm1);
        cinema.addNewFilm(newFilm2);
        cinema.addNewFilm(newFilm3);

        LinkedHashMap<Integer, ArrayList<Film>> hashMap2 = cinema.getFilmsSortedByYear();
        for (Map.Entry<Integer, ArrayList<Film>> entry : hashMap2.entrySet()) {
            System.out.println(entry.getKey());
            ArrayList<Film> filmsByYear = entry.getValue();
            for (Film film : filmsByYear) {
                System.out.println(film);
            }
        }

        System.out.println();

        for (Film film : cinema.getFilmsByYear(2000)) {
            System.out.println(film);
        }

        System.out.println();

        for (Film film : cinema.getFilmsByYearAndMonth(2000, months[3].toString())) {
            System.out.println(film);
        }

        System.out.println();

        for (Film film : cinema.getFilmsByGenre(genres[1].toString())) {
            System.out.println(film);
        }

        System.out.println();

        int counter = 1;
        for (Film film : cinema.getTop10FilmsByRating(10)) {
            System.out.println(counter + " - " + film);
            counter++;
        }

        System.out.println();

        cinema.addNewFilm(newFilm1);
        cinema.addNewFilm(newFilm2);
        cinema.addNewFilm(newFilm3);


    }
}