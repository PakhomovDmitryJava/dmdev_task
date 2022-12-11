package oop.lesson10.hometask1;

/**
 * Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях.
 */
public class Hometask1 {
    public static void main(String[] args) {
        String someString1 = "А роза упала на лапу Азора, , , , , ,,! !!!!!_______";
        palindromeChecker(someString1);
        String someString2 = "А вот он я, Лобов О.Б., Оля Нотова";
        palindromeChecker(someString2);
    }

    public static void palindromeChecker(String value) {

        String clearedValue = value.replace("!", "")
                .replace(".", "")
                .replace(",", "")
                .replace("+", "")
                .replace("-", "")
                .replace("?", "")
                .replace("_", "")
                .replace(":", "")
                .replace(" ", "")
                .toLowerCase();
        System.out.println(clearedValue);

        StringBuilder sb = new StringBuilder(clearedValue);
        String reversedAndClearedValue = sb.reverse().toString();
        System.out.println(reversedAndClearedValue);

        if (clearedValue.equals(reversedAndClearedValue)) {
            System.out.println("This is a palindrome!");
        } else {
            System.out.println("This is NOT a palindrome!");
        }
    }

}
