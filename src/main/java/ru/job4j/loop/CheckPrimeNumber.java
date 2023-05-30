package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
       for (int i = 1; i <= number; i++) {
           if (i % number == 0 && number % 1 == 0 && number > 1) {
               prime = true;
               break;
           }
           i++;
       }
        return prime;
    }
}
