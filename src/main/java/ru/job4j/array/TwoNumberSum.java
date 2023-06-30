package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int temp = 0;
        int temp1 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    temp = i;
                    temp1 = j;
                    array = new int[2];
                    array[0] = temp;
                    array[1] = temp1;
                    return array;
                }

            }
        }
        return new int[0];

    }
}