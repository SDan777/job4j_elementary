package ru.job4j.array;

import jdk.jshell.Snippet;

import java.sql.SQLOutput;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            } else {
                rst = -1;
                break;
            }
        }
        return rst;
    }
}