package com.type_conversion;

public class Main {
    public static void main(String[] args) {
        // Inteiro para String
        int intType = 123;
        String intToString = Integer.toString(intType);
        System.out.println(intToString);
        // String para Inteiro
        int stringToInt = Integer.parseInt(intToString);
        System.out.println(stringToInt);

        // Double para String
        double doubleType = 123.12;
        String doubleToString = Double.toString(doubleType);
        System.out.println(doubleToString);
        // String para double
        double stringToDouble = Double.parseDouble(doubleToString);
        System.out.println(stringToDouble);

        // Boleano para Inteiro
        boolean booleanType = true;
        int booleanToInt = booleanType ? 1 : 0;
        System.out.println(booleanToInt);
    }
}