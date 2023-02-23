package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "I don't know. Please, ask another question.";
        if ("Hi, Bot.".equals(question)) {
            rsl = new String("Hi, SmartAss");
        } else if ("Bye.".equals(question)) {
            rsl = new String("See you later");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Hi, Bot.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Bye.");
        System.out.println(rsl);
        rsl = DummyBot.answer("What you name");
        System.out.println(rsl);
    }
}
