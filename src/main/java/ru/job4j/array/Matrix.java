package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int index;
        int[][] data = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                data[i][j] = (j + 1) * (i + 1);
            }
        }
        return data;
    }
}