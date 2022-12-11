package oop.lesson18.hometask;

/**
 * 2. Создать статический обобщённый метод swap
 * в утилитном классе PairUtil (утилитный класс – это класс
 * только со статическими методами, который имеет
 * private конструктор и помечен ключевым словом final,
 * чтобы предотвратить создание объектов этого класса,
 * а также наследоваться от него). Метод должен
 * принимать объект класса Pair и возвращать
 * новый объект Pair, в которой элементы поменяны местами.
 */
public final class PairUtil {

    private PairUtil() {
    }

    public static <K, V> Pair <V, K> swap(Pair<K, V> pair) {
        return new Pair<>(pair.getType2(), pair.getType1());
    }
}
