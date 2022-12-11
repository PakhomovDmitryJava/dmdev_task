package oop.lessson27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFindExample {
    public static void main(String[] args) {
        String phoneNumbers = "asdasd +375 (22) 895-13-65 asdasd asdasd +375 (29) 111-13-65" +
                "asdasd +375 (33) 895-13-22 dfkgh dfasdasd +375 (29) 111-22-33 asdasdasdas";

        String phoneRegex1 = "(?:\\+375)??\\s\\((?<code>\\d{2})\\)(\\s\\d{3})-(\\d{2})-(\\d{2})";
        String phoneRegex2 = "^(\\+375)??\\s\\(\\d{2}\\)\\s\\d{3}-\\d{2}-\\d{2}";

        Pattern pattern1 = Pattern.compile(phoneRegex1);
        Pattern pattern2 = Pattern.compile(phoneRegex2);

        Matcher matcher1 = pattern1.matcher(phoneNumbers);
        Matcher matcher2 = pattern2.matcher(phoneNumbers);

//        StringBuilder sb = new StringBuilder();
////        while (matcher1.find()) {
////            matcher1.appendReplacement(sb,"XXX");
////        }
//
//        while (matcher1.find()) {
//            String group = matcher1.group(2);
//            String group1 = matcher1.group(3);
//            String group2 = matcher1.group(4);
//            matcher1.appendReplacement(sb,"$2 $3 $4");
//        }
//        matcher1.appendTail(sb);
//
//        System.out.println(sb);
//
//        // All matches
//        while (matcher1.find()) {
//            System.out.println(matcher1.group());
//            System.out.println(matcher1.group("code"));
//        }
//
//        System.out.println();
//
//        // First in the string line
//        while (matcher2.find()) {
//            System.out.println(matcher2.group());
//        }

        System.out.println(phoneNumbers.replaceAll(phoneRegex1, "$2-$3-$4("));
    }
}
