package lesson5.hometask;

/**
 * Написать программу, вычисляющую корни квадратного уравнения вида ax ² + bx + c = 0, где a, b и c - целочисленные параметры функции run.
 * Вывести корни квадратного уравнения на консоль.
 * Если их два, то перечислить каждый с новой строки в консоли (просто использовать два раза System.out.println).
 * Если дискриминант отрицательный, вывести на консоль сообщение "нет корней".
 * При решении создать и использовать следующие функции:
 * - функция isPositive, определяющая, является ли число положительным
 * - функция isZero, определяющая, является ли число нулём
 * - функция discriminant, вычисляющая дискриминант
 * Обращайте внимание, что параметры все целочисленные, а корни могут иметь дробную часть.
 */

public class Hometask2 {
    public static void main(String[] args) {
        root(-4, 28, -49);
    }

    public static int discriminant(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    public static boolean isPositive(int discr) {
        return !isZero(discr) && discr > 0;
    }

    public static boolean isZero(int discr) {
        return discr == 0;
    }

    public static void root(int a, int b, int c) {
        if (!isPositive(discriminant(a, b, c)) && !isZero(discriminant(a, b, c))) {
            System.out.println("There are no roots!");
        } else if (isZero(discriminant(a, b, c))) {
            double root1 = (double) -b / (double) (2 * a);
            System.out.println(root1);
        } else if (isPositive(discriminant(a, b, c))) {
            double root1 = (-b + Math.sqrt(discriminant(a, b, c))) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant(a, b, c))) / (2 * a);
            System.out.println(root1);
            System.out.println(root2);
        }
    }
}
