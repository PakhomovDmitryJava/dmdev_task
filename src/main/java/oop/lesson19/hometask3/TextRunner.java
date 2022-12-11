package oop.lesson19.hometask3;

import java.util.LinkedHashSet;
import java.util.List;

/**
 * Задан текст на английском языке.
 * Выделить все различные слова.
 * Для каждого слова подсчитать частоту его встречаемости.
 * Слова, отличающиеся регистром букв, считать различными.
 */
public class TextRunner {
    public static void main(String[] args) {
        String text = "Fruit Fruit Fruit Fruit fruit and vegetables vegetables contain the vitamins and minerals " +
                "we need to stay healthy. But five is actually a fictional number " +
                "thought up by an American nutritionist likely. She looked vegetables at what the average " +
                "person ate and doubled it. According to more recent research, vegetables the right " +
                "number is actually eight. The research shows that people who have eight " +
                "pieces of fruit and vegetables a day are much less likely likely to suffer " +
                "from heart disease than those who eat three.";

        List<String> words = TextUtil.getTextAsListOfWords(text);

        System.out.println(words.get(0));

        for (String string : words) {
            System.out.println(string);
        }

        LinkedHashSet<String> uniqueWords = TextUtil.uniqueWords(words);
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }

        TextUtil.wordsCounter(words);
    }

}
