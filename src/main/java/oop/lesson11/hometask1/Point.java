package oop.lesson11.hometask1;
/**
 * Внимание. При выполнении задания держите в уме принцип инкапсуляции.
 * Создать класс Point, описывающий точку в двумерных координатах.
 * Полями этого класса должны быть координаты x и y.
 * Класс должен иметь один конструктор, принимающий координаты x и y.
 * Добавьте функционал для получения скрытой информации (координаты точки), а получить её можно только с помощью методов доступа (get/set).
 * Создать метод distance, принимающий объект Point и определяющий расстояние до неё.
 * Используя класс точки, создать класс Rectangle, описывающий прямоугольник.
 * В нём хранятся два поля типа Point - координаты левого верхнего и правого нижнего углов.
 * Создать следующие методы в классе Rectangle:
 * - Высчитывающий площадь прямоугольника
 * - Высчитывающий длину диагонали
 * Написать тестовый класс с методом main программу, демонстрирующим создание объекта класса Rectangle и применение вышеперечисленных методов.
 */
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point secondPoint) {
        //AB = √(xb - xa)2 + (yb - ya)2
        return Math.sqrt(Math.pow(x - secondPoint.getX(),2) + Math.pow(y - secondPoint.getY(), 2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
