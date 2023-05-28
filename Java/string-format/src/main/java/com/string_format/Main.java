package com.string_format;

public class Main {
    public static void main(String[] args) {
        var doctor = "Chamando Doutor Hans Chucrutes, chamando Doutor Hans Chucrutes";
        var police = "se o Pica-Pau tivesse comunicado a polícia nada disso teria acontecido";
        var industry = "Em todos esses anos nessa indústria vital, essa é a primeira vez que isso me acontece";
        var popcorn = "Você falou pipoca?";
        var hotButtered = "Quentinha e na manteiga?";
        var characters = "Pica-Pau;Leôncio;Srta. Meany;Zeca Urubu;Picolino;Andy Panda";

        // Quantidade de caracteres
        System.out.println(industry.length());

        // Contagem de ocorrências
        var count = doctor.replace(" ", "").split("HansChucrutes").length;
        System.out.println(count);

        // Concatenação
        System.out.println(popcorn + hotButtered);

        // Primeira letra maiúscula
        System.out.println(Character.toUpperCase(police.charAt(0)) + police.substring(1));

        // Substituição
        var sealion = police.replace("Pica-Pau", "Leôncio");
        System.out.println(sealion);

        // Quebrar a string em lista
        var charactersList = characters.split(";");
        System.out.println("[" + String.join(", ", charactersList) + "]");

        // Juntar lista para string
        var returnCharacters = String.join(", ", charactersList);
        System.out.println(returnCharacters);

    }
}