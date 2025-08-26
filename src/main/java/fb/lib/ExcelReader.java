package fb.lib;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ExcelReader {

    public static List<Map<String, String>> readSheet(String path, String sheetName) throws IOException {
        try (FileInputStream fis = new FileInputStream(path);
             Workbook wb = new XSSFWorkbook(fis)) {

            Sheet sheet = wb.getSheet(sheetName);
            if (sheet == null) throw new IllegalArgumentException("Sheet not found: " + sheetName);

            List<Map<String, String>> data = new ArrayList<>();
            Iterator<Row> iterator = sheet.iterator();
            if (!iterator.hasNext()) return data;

            Row header = iterator.next();
            List<String> headers = new ArrayList<>();
            for (Cell c : header) headers.add(c.getStringCellValue());

            while (iterator.hasNext()) {
                Row row = iterator.next();
                Map<String, String> rowData = new LinkedHashMap<>();
                for (int i = 0; i < headers.size(); i++) {
                    Cell cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                    rowData.put(headers.get(i), getString(cell));
                }
                data.add(rowData);
            }
            return data;
        }
    }

    public static Map<String, String> readRowByKey(String path, String sheetName, String keyColumn, String keyValue) throws IOException {
        for (Map<String, String> row : readSheet(path, sheetName)) {
            if (keyValue.equals(row.getOrDefault(keyColumn, ""))) {
                return row;
            }
        }
        throw new NoSuchElementException("Row not found for " + keyColumn + "=" + keyValue);
    }

    private static String getString(Cell cell) {
        if (cell == null) return "";
        switch (cell.getCellType()) {
            case STRING: return cell.getStringCellValue();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue().toString();
                } else {
                    double d = cell.getNumericCellValue();
                    if (d == Math.floor(d)) return String.valueOf((long)d);
                    return String.valueOf(d);
                }
            case BOOLEAN: return String.valueOf(cell.getBooleanCellValue());
            case FORMULA: return cell.getCellFormula();
            case BLANK: default: return "";
        }
    }
}
