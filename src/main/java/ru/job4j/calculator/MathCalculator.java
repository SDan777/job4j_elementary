package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double diffAndDiv(double first, double second) {
        return different(first, second) + division(first, second);
    }

    public static double sumFunc(double first, double second) {
        return sum(first, second) + multiply(first, second) + different(second, first) + division(second, first);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20) + " " + diffAndDiv(20, 10) +" " + sumFunc(10, 20));
    }
}
