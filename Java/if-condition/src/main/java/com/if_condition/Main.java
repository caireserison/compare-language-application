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
                    "O número do apartamento da Monica é igual a 20, é maior que o número do Joey e menor que o vizinho ao lado.");
        }

        if (!(neighborApartment == 21)) {
            System.out.println("O apartamento do vizinho é diferente de 21.");
        } else if (joeyApartment != 19) {
            System.out.println("O apartamento do Joey é diferente de 19.");
        } else {
            System.out.println("OH. MEU. DEUS.");
        }

        if (phoebeSong.equals("Smelly Cat")) {
            System.out.println("What are they feeding you?");
        }

        if (friends.contains("Chandler")) {
            var chandlerIndex = friends.indexOf("Chandler");
            System.out.println("Oi, Eu sou o " + friends.get(chandlerIndex) + ". Eu faço piadas quando estou desconfortável.");
        }
    }
}
