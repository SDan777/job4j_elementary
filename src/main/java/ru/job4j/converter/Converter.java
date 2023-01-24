package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
       float rsl = value / 70;
       return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollar. ");

        float in = 180;
        float expended = 3;
        float out = Converter.rubleToDollar(in);
        boolean pass = expended == out;
        System.out.println("180 rubles are 3. Test result : " + pass);
    }

}
