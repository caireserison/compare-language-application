package com.switch_case;

public class Main {
    public static void main(String[] args) {
        var day = DaysWeek.SUNDAY;

        switch (day) {
            case MONDAY:
                System.out.println("Comida Tailandesa / Frango com molho de amendoim extra");
                break;
            case TUESDAY:
                System.out.println("Hamburger");
                break;
            case WEDNESDAY:
                System.out.println("Dia de jogos");
                break;
            case THURSDAY:
                System.out.println("Quinta onde tudo pode acontecer");
                break;
            case FRIDAY:
                System.out.println("Comida chinesa");
                break;
            case SATURDAY:
                System.out.println("Noite da lavanderia");
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