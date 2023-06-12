package com.loop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var itens = new ArrayList<String>() {{
            add("Casco Verde");
            add("Casco Vermelho");
            add("Raio");
            add("Banana");
            add("Estrela");
            add("Cogumelo");
            add("Casco Azul");
        }};
        var position = 8;

        // for
        for (int lap = 1; lap <= 3; lap++) {
            System.out.println(lap + "ª volta");
        }

        // foreach
        for (var item : itens) {
            System.out.println("Você pegou " + item);
        }

        // while
        while (position > 1) {
            position--;
            System.out.println("Você ultrapassou 1 kart. Você está na " + position + "ª posição.");
        }

        // do while
        do {
            position++;
            System.out.println("Você foi atingido. Perdeu uma posição. você está na " + position + "ª posição.");
        } while (position < 8);

        if (position == 8) {
            System.out.println("Você foi o último na corrida.");
        }
    }
}