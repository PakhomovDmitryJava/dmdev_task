package lesson5.hometask;

/**
 * Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
 * Вывести дату следующего дня в формате "День.Месяц.Год".
 * Учесть переход на следующий месяц, а также следующий год.
 * Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.
 */
public class Hometask1 {
    public static void main(String[] args) {
        System.out.println(nextDay(31, 12, 2021));
    }

    public static String nextDay(int day, int month, int year) {
        // 28 days - month 02 if not leap year
        if ((!isLeapYear(year)) && (month == 2) && (day == 28)) {
            String dayAfter = 1 + "." + 3 + "." + year;
            return dayAfter;

            // 29 days - month 02 if not leap year
        } else if ((isLeapYear(year)) && (month == 2) && (day == 28)) {
            String dayAfter = (day + 1) + "." + month + "." + year;
            return dayAfter;

            // 30 days - month 04,06,09,11
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day == 30) && month != 2 && month != 12) {
            String dayAfter = 1 + "." + (month + 1) + "." + year;
            return dayAfter;

            // 31 days - month 01,03,05,07,08,10,12
        } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day == 31) && month != 2 && month != 12) {
            String dayAfter = 1 + "." + (month + 1) + "." + year;
            return dayAfter;

            //the end of the year
        } else if (day == 31 && month == 12) {
            String dayAfter = 1 + "." + 1 + "." + (year + 1);
            return dayAfter;

            // usual day
        } else {
            String dayAfter = (day + 1) + "." + month + "." + year;
            return dayAfter;
        }

    }

    public static boolean isLeapYear(int year) {
        return (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0));
    }
}
