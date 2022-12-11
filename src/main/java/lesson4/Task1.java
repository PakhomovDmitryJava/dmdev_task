package lesson4;

/**
 * 1. Дан порядковый номер месяца. Вывести время года.
 */
public class Task1 {
    public static void main(String[] args) {
        int month = 1;
        if (month >= 3 && month <= 5) {
            System.out.println("It's a spring month.");
        } else if (month >= 6 && month <= 8) {
            System.out.println("It's a summer month.");
        } else if (month >= 9 && month <= 11) {
            System.out.println("It's a autumn month.");
        } else if (month == 12 || month == 1 || month == 2) {
            System.out.println("It's a winter month.");
        } else {
            System.out.println("You inputted incorrect number!");
        }
    }
}
