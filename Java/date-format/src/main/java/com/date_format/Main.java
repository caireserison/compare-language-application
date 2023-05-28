package com.date_format;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Data e hora atuais com formatação padrão
        var now = LocalDateTime.now();
        System.out.println(now);

        // Formatando para dd/MM/aaaa HH:mm:ss
        var formater = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        var formatDate = now.format(formater);
        System.out.println(formatDate);
    }
}
