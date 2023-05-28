package com.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        var pets = new ArrayList<String>() {{
            add("dog");
            add("cat");
            add("rabbit");
            add("dog");
            add("turtle");
            add("parrot");
            add("cat");
            add("lizard");
            add("snake");
        }};

        // Lista criada e sua quantidade de itens
        System.out.println(pets);
        System.out.println("This list has " + pets.size() + " pets.");

        // Removendo registros duplicados
        var hashsetPets = new HashSet<String>(pets);
        var petsWithoutDuplicates = new ArrayList<String>(hashsetPets);
        System.out.println(petsWithoutDuplicates);

        // Identificando e alterando item da lista
        var indexChange = petsWithoutDuplicates.indexOf("parrot");
        petsWithoutDuplicates.set(indexChange, "fish");
        System.out.println(petsWithoutDuplicates);

        // Removendo e adicionando item
        petsWithoutDuplicates.remove("snake");
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