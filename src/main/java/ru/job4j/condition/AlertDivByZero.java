package ru.job4j.condition;

public class AlertDivByZero {

    public static void possibleDiv(int number) {
        boolean result = number == 0;
        if (result) {
            System.out.println("Could not div by 0");
        }
    }

    public static void negativeDiv(int number) {
            if (number < 0) {
                System.out.println("Could not div number > 0");
            }
        }

        public static void main(String[] args) {
            AlertDivByZero.possibleDiv(4);
            AlertDivByZero.possibleDiv(0);
            AlertDivByZero.negativeDiv(-3);
    }
}