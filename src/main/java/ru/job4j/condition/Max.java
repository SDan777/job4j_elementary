package ru.job4j.condition;

public class Max {
    public static int max(int right, int left) {
        //boolean condition = left < right;
        int result = left < right ? right : left;
        return result;
    }
    public static void main(String[] args) {
        int Str = Max.max(200,200);
        System.out.println(Str);
    }
}
