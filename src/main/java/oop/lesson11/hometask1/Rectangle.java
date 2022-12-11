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
public class Rectangle {
    private Point leftTopPoint;
    private Point rightBottomPoint;

    public Rectangle(Point leftTopPoint, Point rightBottomPoint) {
        this.leftTopPoint = leftTopPoint;
        this.rightBottomPoint = rightBottomPoint;
    }

    public double rectangleSquare() {
        double xSide = rightBottomPoint.getX() - leftTopPoint.getX();
        double ySide = leftTopPoint.getY() - rightBottomPoint.getY();
        return xSide * ySide;
    }

    public double rectangleDiagonal() {
        return leftTopPoint.distance(rightBottomPoint);
    }

    public Point getLeftTopPoint() {
        return leftTopPoint;
    }

    public void setLeftTopPoint(Point leftTopPoint) {
        this.leftTopPoint = leftTopPoint;
    }

    public Point getRightBottomPoint() {
        return rightBottomPoint;
    }

    public void setRightBottomPoint(Point rightBottomPoint) {
        this.rightBottomPoint = rightBottomPoint;
    }
}
