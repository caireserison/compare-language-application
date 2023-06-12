package com.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        var pets = new ArrayList<String>() {{
            add("cachorro");
            add("gato");
            add("coelho");
            add("cachorro");
            add("tartaruga");
            add("papagaio");
            add("gato");
            add("lagarto");
            add("cobra");
        }};

        // Lista criada e sua quantidade de itens
        System.out.println(pets);
        System.out.println("Essa lista tem " + pets.size() + " animais.");

        // Removendo registros duplicados
        var hashsetPets = new HashSet<String>(pets);
        var petsWithoutDuplicates = new ArrayList<String>(hashsetPets);
        System.out.println(petsWithoutDuplicates);

        // Identificando e alterando item da lista
        var indexChange = petsWithoutDuplicates.indexOf("papagaio");
        petsWithoutDuplicates.set(indexChange, "peixe");
        System.out.println(petsWithoutDuplicates);

        // Removendo e adicionando item
        petsWithoutDuplicates.remove("cobra");
        petsWithoutDuplicates.add("hamster");
        System.out.println(petsWithoutDuplicates);

        // Ordenando itens
        Collections.sort(petsWithoutDuplicates);
        System.out.println(petsWithoutDuplicates);

        // Limpando a lista
        petsWithoutDuplicates.clear();
        System.out.println(petsWithoutDuplicates);
    }
}