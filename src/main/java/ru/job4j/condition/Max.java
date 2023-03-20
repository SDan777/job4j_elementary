package ru.job4j.condition;

public class Max {
    public static int max(int right, int left) {
      return left < right ? right : left;
    }

    public static void main(String[] args) {
        int str = Max.max(200, 200);
        System.out.println(str);
    }
}
