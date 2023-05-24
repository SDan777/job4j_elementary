package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int l = 1;
        int s = 1;
        for (int i = 2; i <= n; i++) {
            s *= i;
            if (n == 1 || n == 0) {
                return n;
            }
        }
        return s;
    }
}