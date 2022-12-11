package hometask5;

/**
 * Задание 1
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * Например:
 * "abc Cpddddddd Dio OsfWw" -> "ABCPDIOSFW"
 */
public class HometaskAlone51 {
    public static void main(String[] args) {
        String someString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaabc Ccpdddddddddddddddddddddddddddddd" +
                "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                "ddddddddddddddddddddddddddddddddddDio OsfWwwwwwwww" +
                "ssssssssssssssssssssssssssssssssssssssssssssss" +
                "ddddddddddddddddttttttttttttttttttttttttttttttttttttttttt";
        stringCleaner(someString);
    }

    public static void stringCleaner(String value) {
        StringBuilder sb = new StringBuilder();
        String deleteSpaces = value.replace(" ", "").toUpperCase();
        for (int i = 0; i < deleteSpaces.length() - 1; i++) {
            if (deleteSpaces.charAt(i) == deleteSpaces.charAt(i + 1)) {
                deleteSpaces = deleteSpaces.replace(deleteSpaces.charAt(i) + Character.toString(deleteSpaces.charAt(i + 1)), Character.toString(deleteSpaces.charAt(i)));
            }
            for (int k = 0; k < deleteSpaces.length() - 1; k++) {
                if (deleteSpaces.charAt(k) == deleteSpaces.charAt(k + 1)) {
                    deleteSpaces = deleteSpaces.replace(deleteSpaces.charAt(k) + Character.toString(deleteSpaces.charAt(k + 1)), Character.toString(deleteSpaces.charAt(k)));
                }
            }
        }

        System.out.println(deleteSpaces);
    }

}
