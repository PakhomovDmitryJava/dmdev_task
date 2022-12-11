package oop.lesson19.hometask1;

import java.util.ArrayList;
import java.util.List;

public final class MarkLengthUtil {
    private static final String TARGET_VALUE = "****";
    private static final int TARGET_LENGTH = 4;


    public static List<String> markLength4(List<String> list) {
        ArrayList<String> results = new ArrayList<>();
        for (String s : list) {
            if (s.length() == TARGET_LENGTH) {
                results.add(TARGET_VALUE);
                results.add(s);
            } else {
                results.add(s);
            }
        }
        return results;
    }

}
