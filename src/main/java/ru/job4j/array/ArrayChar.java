package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
            for (int j = 0; j < pref.length; j++) {
                if (pref[j] != word[j]) {
                    result = false;
                    System.out.println(result);
                    break;
                } else {
                    result = true;
                    System.out.println(result);
                }
            }
        return result;
    }
}
