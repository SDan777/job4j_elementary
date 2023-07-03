package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            int j = array.length - 1;
            while ( i != j){
                if (array[i] + array[j] == target) {
                    return new int[]{i,j};
                }
                else{
                    j--;
                }
            }
        }
        return new int[0];

    }

}