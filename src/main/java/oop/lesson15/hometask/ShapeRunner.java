package oop.lesson15.hometask;
/**
 * Создать иерархию классов, описывающих геометрические фигуры на плоскости.
 * - Можно пользоваться результатами предыдущего ДЗ.
 * - В иерархии должно быть не менее 10 классов/интерфейсов и хотя бы 2 уровня вложенности.
 * - Продемонстрировать переопределение методов в иерархии.
 * - Продемонстрировать добавление собственных методов в классах-наследниках (можно с помощью интерфейсов).
 * Например, расчёт диагонали в прямоугольнике, расчёт высоты в треугольнике.
 * - При разработке иерархии держать в уме принцип инкапсуляции, выбирать корректные имена классов и методов, пользоваться преимуществами полиморфизма.
 * - Отдавайте предпочтение интерфейсам, а не абстрактным классам.
 * - При переопределении методов обязательно использовать аннотацию @Override
 * - Не создавать лишних классов в системе (полностью дублирующих или не содержащих назначения)
 * - Каждый класс должен выполнять своё назначение.
 * - Создать общие методы:
 * 1. Рассчитывающий площадь фигуры.
 * 2. Принимающий в качестве параметра фигуру и определяющий, равны ли площади текущей и полученной фигуры.
 * - Создать класс ShapeUtils со статическими методами:
 * 1. Определяющим, является ли фигура прямоугольником.
 * 2. Определяющим, является ли фигура треугольником.
 * - Для каждого неабстрактного класса переопределить метод toString() класса для представления информации о классах в строковой форме.
 * В этом задании нет одного правильного решения, подойдите к нему творчески.
 */
public class ShapeRunner {
    public static void main(String[] args) {
        Circle round = new Round(5);
        System.out.println(round.findSquare());
        Rectangle square = new Square(5);
        System.out.println(square.findSquare());
        Triangle rightTriangle = new RightTriangle(5,10);
        System.out.println(rightTriangle.findSquare());

        System.out.println(round.squareComparison(square));
        System.out.println(rightTriangle.squareComparison(square));
        System.out.println(round.squareComparison(square));

        System.out.println(ShapeUtils.isRectangle(round));
        System.out.println(round);
        System.out.println(ShapeUtils.isRectangle(square));
        System.out.println(square);
        System.out.println(ShapeUtils.isTriangle(square));
        System.out.println(ShapeUtils.isTriangle(rightTriangle));
        System.out.println(rightTriangle);

    }
}
