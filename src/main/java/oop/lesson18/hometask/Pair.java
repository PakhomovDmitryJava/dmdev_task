package oop.lesson18.hometask;

/**
 * * 1. Создать класс Pair, параметризованный двумя
 * * параметрами K и V. Класс должен хранить две
 * * переменные типов K и V соответственно. У
 * * класса должен быть конструктор,
 * * принимающий 2 параметра типов K и V, а
 * * также набор соответствующих
 * * геттеров/сеттеров, toString (для отображения состояния
 * * текущего объекта типа Pair)
 */
public class Pair<K, V> {
    private K type1;
    private V type2;

    public Pair(K type1, V type2) {
        this.type1 = type1;
        this.type2 = type2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "type1=" + type1 +
                ", type2=" + type2 +
                '}';
    }

    public K getType1() {
        return type1;
    }

    public void setType1(K type1) {
        this.type1 = type1;
    }

    public V getType2() {
        return type2;
    }

    public void setType2(V type2) {
        this.type2 = type2;
    }
}
