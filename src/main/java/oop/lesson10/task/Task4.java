package oop.lesson10.task;

/**
 * 4. Подсчитать количество всех точек, запятых и восклицательных знаков в строке.
 */
public class Task4 {
    public static void main(String[] args) {
        String string = "123123 sadasd !!!!!!!! 123123asdasd ........ !!!!!!!!!!!!............ ,,,,,,,,,,,asdasdasdasd123123123";
        punctuationCounter(string);
    }

    public static void punctuationCounter(String value) {
        char[] letters = value.toCharArray();
        int point = 0;
        int comma = 0;
        int exclamationMark = 0;
        for (char letter : letters) {
            switch (letter) {
                case ('.') -> point += 1;
                case (',') -> comma += 1;
                case ('!') -> exclamationMark += 1;
            }
        }
        System.out.println("Points - " + point +
                ", commas - " + comma +
                ", exclamation marks - " + exclamationMark + ", total count - " + (point + comma + exclamationMark));
    }
}
