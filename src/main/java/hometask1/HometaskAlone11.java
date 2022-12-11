package hometask1;

/**
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * Протестировать функцию в main.
 */

public class HometaskAlone11 {
    public static void main(String[] args) {
        for (int i = 0; i < 60; i++) {
            quarterIdentifier(i);
        }
    }

    public static void quarterIdentifier(int minute) {
        if (minute >= 0 && minute < 15) {
            System.out.println(minute + " - this is a first quarter of an hour.");
        } else if (minute >= 15 && minute < 30) {
            System.out.println(minute + " - this is a second quarter of an hour.");
        } else if (minute >= 30 && minute < 45) {
            System.out.println(minute + " - this is a third quarter of an hour.");
        } else if (minute >= 45 && minute < 60) {
            System.out.println(minute + " - this is a fourth quarter of an hour.");
        }
    }
}
