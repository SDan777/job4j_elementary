package ru.job4j.loop;

public class CounterOne {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }
    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (start % 2 == 0) {
                sum += i;
            }
            start++;
        }
        return sum;
    }
}