package lesson4;

/**
 * 3. Имеется целое число, вводимое пользователем с консоли. Это число - сумма денег в рублях.
 * Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля")
 */
public class Task3 {
    public static void main(String[] args) {
        for (int i = 0; i < 301; i++) {
            int rubles = i;
            if (rubles % 10 == 1 && rubles % 100 != 11) {
                System.out.println(rubles + " рубль");
            } else if ((rubles % 10 == 2 || rubles % 10 == 3 || rubles % 10 == 4) && !(rubles % 100 == 12 || rubles % 100 == 13 || rubles % 100 == 14)) {
                System.out.println(rubles + " рубля");
            } else {
                System.out.println(rubles + " рублей");
            }
        }
    }
}
