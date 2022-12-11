package hometask1;

/**
 * Даны два прямоугольных треугольника.
 * Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 * <p>
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */
public class HometaskAlone13 {
    public static void main(String[] args) {
        trianglesComparison(findTriangleSquare(4.2, 5.2), findTriangleSquare(4.2, 5.2));
    }

    public static double findTriangleSquare(double aSide, double bSide) {
        return (aSide * bSide) / 2;
    }

    public static void trianglesComparison(double first, double second) {
        if (first > second) {
            System.out.println("The first triangle is bigger than the second triangle!");
        } else if (first == second) {
            System.out.println("The triangles are equal!");
        } else if (first < second) {
            System.out.println("The first triangle is smaller than the second triangle!");
        }
    }
}
