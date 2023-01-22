package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double res1 = Math.pow((x2 - x1), 2);
        double res2 = Math.pow((y2 - y1), 2);
        double res3 = res1  + res2;
        double rsl = Math.sqrt(res3);
        return rsl;
    }
    public static void main(String[] args) {
        double result = Point.distance(2, 2, 2, 4);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
