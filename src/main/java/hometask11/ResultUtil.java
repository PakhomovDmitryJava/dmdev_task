package hometask11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Задача:
 * Считать оба CSV файла и объединить их по полю ID в один result.csv, где будут следующие поля: ID, NAME, PRICE.
 * Желательно реализовать доп. функционал:
 * Если для каких-то ID не будет значений в обоих файлах, то записать их в один файл errors.csv, где будет лишь одно поле ID.
 */
public final class ResultUtil {
    private static final String SEPARATOR = ",";

    //как это параметризовать?
    public static Map<Integer, Item> readItemsCSV(Path path) {
        String line;
        String[] strings;
        Map<Integer, Item> map = new HashMap<>();
        try (BufferedReader br = Files.newBufferedReader(path, UTF_8)) {
            while ((line = br.readLine()) != null) {
                strings = line.split(SEPARATOR);
                map.put(Integer.valueOf(strings[0]), new Item(Integer.parseInt(strings[0]), strings[1], strings[2]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return map;
    }

    public static Map<Integer, Price> readPricesCSV(Path path) {
        String line;
        String[] strings;
        Map<Integer, Price> map = new HashMap<>();
        try (BufferedReader br = Files.newBufferedReader(path, UTF_8)) {
            while ((line = br.readLine()) != null) {
                strings = line.split(",");
                map.put(Integer.valueOf(strings[0]), new Price(Integer.parseInt(strings[0]), Double.parseDouble(strings[1])));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return map;
    }

    public static Map<Integer, Result> getResultCSV(Path pathToPrices, Path pathToItems, Path pathToErrors) throws NullPointerException {
        Map<Integer, Item> itemMap = readItemsCSV(pathToItems);
        Map<Integer, Price> priceMap = readPricesCSV(pathToPrices);
        HashMap<Integer, Result> resultCSV = new HashMap<>(itemMap.size() + priceMap.size());
        Set<Integer> errorsList = new HashSet<>();
        for (Map.Entry<Integer, Item> entry : itemMap.entrySet()) {
            Integer keyItem = entry.getKey();
            Item valueItem = entry.getValue();
            for (Map.Entry<Integer, Price> integerPriceEntry : priceMap.entrySet()) {
                Integer keyPrice = entry.getKey();
                Item valuePrice = entry.getValue();
                if (!priceMap.containsKey(keyItem)) {
                    errorsList.add(keyItem);
                } else if (!itemMap.containsKey(keyPrice)) {
                    errorsList.add(keyPrice);
                } else {
                    resultCSV.put(keyItem, new Result(keyItem, valueItem.getName(), priceMap.get(keyItem).getPrice()));
                }
            }
        }
        writeErrorsCSV(errorsList, pathToErrors);
        return resultCSV;
    }

    public static void writeResultCSV(Map<Integer, Result> resultMap, Path pathForResult) {
        try (BufferedWriter fileWriter = Files.newBufferedWriter(pathForResult)) {
            for (Result resultEntry : resultMap.values()) {
                fileWriter.append(resultEntry.toString());
                fileWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeErrorsCSV(Set<Integer> errorsList, Path pathForResult) {
        try (BufferedWriter fileWriter = Files.newBufferedWriter(pathForResult)) {
            for (Integer integer : errorsList) {
                fileWriter.append(integer.toString());
                fileWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



