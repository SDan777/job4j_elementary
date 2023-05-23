package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int l = 1;
        int s = 1;
        for (int i = 1; i < n; i++) {
            l = i + 1;
            s *= l; //6
            if (n == 1 || n == 0) {
                return n;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(calc(12));
        System.out.println(calc(6));
        System.out.println(calc(1));
        System.out.println(calc(0));
    }
}