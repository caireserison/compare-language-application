package com.if_condition;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var joeyApartment = 19;
        var monicaApartment = 20;
        var neighborApartment = 21;
        var phoebeSong = "Smelly Cat";
        var friends = new ArrayList<String>() {
            {
                add("Ross");
                add("Joey");
                add("Chandler");
                add("Rachel");
                add("Monica");
            }
        };

        if (monicaApartment == 20 && (monicaApartment > joeyApartment || monicaApartment < neighborApartment)) {
            System.out.println(
                    "Monica's apartment equals 20 and is greater than Joey apartment or less than other neighbor apartment.");
        }

        if (!(neighborApartment == 21)) {
            System.out.println("Neighbor apartment is different from 21.");
        } else if (joeyApartment != 19) {
            System.out.println("Joey's apartment is different from 19.");
        } else {
            System.out.println("Oh. My. God.");
        }

        if (phoebeSong.equals("Smelly Cat")) {
            System.out.println("What are they feeding you?");
        }

        if (friends.contains("Chandler")) {
            var chandlerIndex = friends.indexOf("Chandler");
            System.out.println("Hi, I'm " + friends.get(chandlerIndex) + ". I make jokes when I'm uncomfortable.");
        }
    }
}
