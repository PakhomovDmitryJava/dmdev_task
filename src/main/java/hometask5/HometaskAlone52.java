package hometask5;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * Посчитать сумму всех чисел из строки
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */
public class HometaskAlone52 {
    public static void main(String[] args) {
        String someString = "Привет 8, 0как0 1 2 твои дела? Может4, сделать 3 дело, " +
                "Привет 8, как 1 2 твои дела? Может5, сделать 9 дело," +
                "Привет 33, как 112 твои33 дела? Может43, 22сделать 223 дело000999999999999999999999";
        for (int arg : digitsFinder(someString)) {
            System.out.println(arg + " ");
        }
        System.out.println(digitsFinder(someString).length);
        System.out.println(averageValue(digitsFinder(someString)));
    }

    public static int[] digitsFinder(String value) {
        String clearedString = value.replace(" ", "");
        StringBuilder sb = new StringBuilder();
        char[] digitsAndLetters = clearedString.toCharArray();
        for (char digitsAndLetter : digitsAndLetters) {
            switch (digitsAndLetter) {
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> sb.append(digitsAndLetter);
            }
        }

        int[] digits = new int[sb.length()];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = Integer.parseInt(String.valueOf(sb.charAt(i)));
        }
        return digits;
    }

    public static double averageValue(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return (double) sum / digits.length;
    }
}
