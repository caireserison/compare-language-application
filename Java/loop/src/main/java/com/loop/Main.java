package com.loop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var itens = new ArrayList<String>() {{
            add("Green Shell");
            add("Red Shell");
            add("Lightning");
            add("Banana");
            add("Starman");
            add("Mushroom");
            add("Spiny Shell");
        }};
        var position = 8;

        // for
        for (int lap = 1; lap <= 3; lap++) {
            System.out.println(lap + " lap");
        }

        // foreach
        for (var item : itens) {
            System.out.println("You got a " + item);
        }

        // while
        while (position > 1) {
            position--;
            System.out.println("Overtook 1 kart. You're in position " + position);
        }

        // do while
        do {
            position++;
            System.out.println("You've been hit. Lost one position. You are in position " + position);
        } while (position < 8);

        if (position == 8) {
            System.out.println("You were last in the race.");
        }
    }
}