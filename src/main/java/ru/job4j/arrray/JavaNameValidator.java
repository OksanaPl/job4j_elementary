package ru.job4j.arrray;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        char[] chars = name.toCharArray();
        if (name.isEmpty() || isUpperLatinLetter(chars[0]) || isDigit(chars[0])) {
            return false;
        }
        for (int i = 1; i < chars.length; i++) {
            if (!(isDigit(chars[i]) || isSpecialSymbol(chars[i])
                || isLowerLatinLetter(chars[i]) || isUpperLatinLetter(chars[i]))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }

    public static boolean isDigit(int code) {
        return code >= 48 && code <= 57;
    }
}
