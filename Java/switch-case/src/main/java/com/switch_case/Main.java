package com.switch_case;

public class Main {
    public static void main(String[] args) {
        var day = DaysWeek.SUNDAY;

        switch (day) {
            case MONDAY:
                System.out.println("Thai food / Mee Krob and chicken satay with extra peanut sauce");
                break;
            case TUESDAY:
                System.out.println("Burger");
                break;
            case WEDNESDAY:
                System.out.println("Games");
                break;
            case THURSDAY:
                System.out.println("Anything Can Happen Thursday");
                break;
            case FRIDAY:
                System.out.println("Chinese food");
                break;
            case SATURDAY:
                System.out.println("Laundry night");
                break;
            default:
                System.out.println("Bazinga!");
        }
    }
}

enum DaysWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}