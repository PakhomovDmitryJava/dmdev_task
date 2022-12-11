package oop.lessson27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String digits = "123";
        String phoneNumber = "+375 (29) 895-13-65";

        String digitsRegex = "\\d{3}";
        String phoneRegex = "(\\+375)??\\s\\(\\d{2}\\)\\s\\d{3}-\\d{2}-\\d{2}";

        Pattern digitsPattern = Pattern.compile("\\d{3}");
        Pattern phoneNumberPattern = Pattern.compile("(\\+375)??\\s\\(\\d{2}\\)\\s\\d{3}-\\d{2}-\\d{2}");

        Matcher matcherDigits = digitsPattern.matcher("123");
        Matcher matcherPhoneNumber = digitsPattern.matcher("123");

        // 1 variant
        System.out.println(matcherDigits.matches());
        System.out.println(matcherPhoneNumber.matches());

        // 2 variant
        System.out.println(Pattern.matches(digitsRegex,digits));
        System.out.println(Pattern.matches(phoneRegex, phoneNumber));

        //3 variant
        System.out.println(digits.matches(digitsRegex));
        System.out.println(phoneNumber.matches(phoneRegex));

    }
}
