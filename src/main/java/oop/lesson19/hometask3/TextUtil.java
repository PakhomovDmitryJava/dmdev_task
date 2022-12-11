package oop.lesson19.hometask3;

import java.util.*;

/**
 * Задан текст на английском языке.
 * Выделить все различные слова.
 * Для каждого слова подсчитать частоту его встречаемости.
 * Слова, отличающиеся регистром букв, считать различными.
 */
public final class TextUtil {
    private final String text;

    public TextUtil(String text) {
        this.text = text;
    }

    public static List<String> getTextAsListOfWords(String string)   {
        String result = removeAllPunctuation(string);
        return Arrays.asList(result.split(" "));
    }

    public static List<String> getTextAsListOfLetters(String text) {
        String replace = TextUtil.removeAllPunctuation(text).toLowerCase().replace(" ", "");
        char[] chars = replace.toCharArray();
        List<String> letters = new ArrayList<>(chars.length);
        for (char aChar : chars) {
            letters.add(String.valueOf(aChar));
        }
        return letters;
    }

    public static String removeAllPunctuation(String string) {
        return string.replace("—", " ")
                .replace("…", " ")
                .replaceAll("\\p{Punct}", "")
                .replaceAll("\\r\\n", " ")
                .replaceAll("  ", "");
    }

    public static LinkedHashSet<String> uniqueWords(List<String> words) {
        return new LinkedHashSet<>(words);
    }

    public static void wordsCounter(List<String> words) {
        for (String word : uniqueWords(words)) {
            System.out.println(word + " - " + Collections.frequency(words, word) + " times");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextUtil that = (TextUtil) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        return "TextUtil{" +
                "text='" + text + '\'' +
                '}';
    }

    public String getText() {
        return text;
    }
}
