package hometask11;

import java.nio.file.Path;
import java.util.Map;

/**
 * Даны два файла в формате CSV.
 * CSV (Comma-Separated Values) файл - это обычный текстовый файл,
 * где через запятую (может использоваться и любой другой символ) перечислены значения.
 * Также может быть в первой строчке таких файлов заголовок с названием колонок.
 * Формат первого файла items-price.csv:
 * ID,PRICE
 * 1,9.98
 * 2,25.05
 * 3,16.45
 * Формат второго файла items-name.csv:
 * ID,NAME,DESCRIPTION
 * 1,Шарф,Теплый зимний шарф красного цвета
 * 2,Шапка,Вязаная зеленая шапка
 * 3,Ботинки,Осенние ботинки на толстой подошве
 * Задача:
 * Считать оба CSV файла и объединить их по полю ID в один result.csv, где будут следующие поля: ID, NAME, PRICE.
 * Желательно реализовать доп. функционал:
 * Если для каких-то ID не будет значений в обоих файлах, то записать их в один файл errors.csv, где будет лишь одно поле ID.
 */
public class ResultRunner {
    public static void main(String[] args) {
        Path pathToItems = Path.of("", "items-name.csv");
        Path pathToPrices = Path.of("", "items-price.csv");
        Path pathToResult = Path.of("", "result.csv");
        Path pathToErrors = Path.of("", "errors.csv");

        Map<Integer, Item> strings1 = ResultUtil.readItemsCSV(pathToItems);
        strings1.values().forEach(System.out::println);

        Map<Integer, Price> strings2 = ResultUtil.readPricesCSV(pathToPrices);
        strings2.values().forEach(System.out::println);


        try {
            Map<Integer, Result> resultCSV = ResultUtil.getResultCSV(pathToPrices, pathToItems, pathToErrors);
            for (Map.Entry<Integer, Result> resultEntry : resultCSV.entrySet()) {
                System.out.println(resultEntry.getKey() + " " + resultEntry.getValue().toString());
                ResultUtil.writeResultCSV(resultCSV, pathToResult);
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
