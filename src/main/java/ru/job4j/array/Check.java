package ru.job4j.array;

import java.sql.SQLOutput;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
                if (data[0] != data[i+1]){
                        result = false;
                        break;
                    } else {
                    result = true;
                break;
            }
        }
        return result;
    }
}