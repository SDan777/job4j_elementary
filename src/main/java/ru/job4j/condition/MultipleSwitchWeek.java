package ru.job4j.condition;

import java.time.MonthDay;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuethday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресение", "Sunday" -> 7;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        String result = "Суббота";
        System.out.println(MultipleSwitchWeek.numberOfDay(result));
    }
}
