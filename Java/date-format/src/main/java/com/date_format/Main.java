package com.date_format;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
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

        // Alterando região para fuso específico
        var region = ZoneId.of("Asia/Tokyo");
        var regionDate = ZonedDateTime.now(region);
        System.out.println(regionDate);
    }
}
