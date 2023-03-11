package ru.job4j.condition;

public class Max {
    public static int max(int right, int left) {
        //boolean condition = left < right;
        return left < right ? right : left;
    }
    public static void main(String[] args) {
        int Str = Max.max(201,202);
        System.out.println(Str);
    }
}
