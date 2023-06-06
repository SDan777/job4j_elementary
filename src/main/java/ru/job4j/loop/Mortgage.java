package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double debt;
        while (amount > 0){
            debt = amount * (percent / 100) + amount;
            amount =  debt - salary;
            year++;
        }
        return year;
    }
}