package lesson6.hometask;

import java.util.Scanner;

/**
 * Написать программу, отображающую статистику по осадкам за N дней. N вводится пользователем.
 * Пользователь также должен ввести N целых чисел, обозначающих величину осадков в день.
 * Программа должна выводить:
 * a. Количество дней
 * b. Сумму осадков за этот период
 * c. Среднее количество осадков за этот период
 * d. Максимальное количество дневных осадков за этот период
 */
public class Hometask3 {
    public static void main(String[] args) {
        precipitationSumCalculation();
    }

    public static void precipitationSumCalculation() {
        Scanner scanner = new Scanner(System.in);
        int precipitationSum = 0;
        int maxPrecipitation = 0;
        System.out.println("Input value of days: ");
        int day = scanner.nextInt();
        for (int i = 1; i <= day; i++) {
            System.out.println("Input value of precipitation for day " + i + ": ");
            int precipitationInput = scanner.nextInt();
            precipitationSum = precipitationSum + precipitationInput;
            if (precipitationInput > averagePrecipitation(precipitationSum, i)) {
                maxPrecipitation = precipitationInput;
            } else {
                continue;
            }
        }
        System.out.println("Number of days: " + day);
        System.out.println("Average value of precipitation: " + averagePrecipitation(precipitationSum, day));
        System.out.println("Sum of precipitation: " + precipitationSum);
        System.out.println("Max value of precipitation: " + maxPrecipitation);
    }

    public static double averagePrecipitation(int precipitationSum, int day) {
        return (double) precipitationSum / day;
    }
}
