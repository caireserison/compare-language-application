package com.json_to_xlsx;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Lendo arquivo json
        File file = new File("example.json");
        FileInputStream fis = new FileInputStream(file);
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(fis);

        // Escrevendo arquivo Excel
        XSSFWorkbook workbook = new XSSFWorkbook();
        workbook.createSheet("Movie");
        Row headerRow = workbook.getSheetAt(0).createRow(0);
        headerRow.createCell(0).setCellValue("name");
        headerRow.createCell(1).setCellValue("releaseYear");
        headerRow.createCell(2).setCellValue("mainCharacter");
        headerRow.createCell(3).setCellValue("genre");
        int rowIndex = 1;
        for (JsonNode node : jsonNode) {
            Row row = workbook.getSheetAt(0).createRow(rowIndex++);
            int columnIndex = 0;
            for (JsonNode field : node) {
                Cell cell = row.createCell(columnIndex++);
                cell.setCellValue(field.asText());
            }
        }
        FileOutputStream fos = new FileOutputStream("Example.xlsx");
        workbook.write(fos);
        fos.close();
        workbook.close();
    }
}
