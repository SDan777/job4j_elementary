package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int s = 1;
        for (int i = 2; i <= n; i++) {
            s *= i;
        }
        return s;
    }
}
