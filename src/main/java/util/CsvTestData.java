package util;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CsvTestData {

    public Object[][] getDataFromCsvFile(String csvFilePath) throws Exception {
        String[][] lineArray = null;
        try (CSVReader reader = new CSVReader(new FileReader(csvFilePath))) {
            List<String[]> csvEntries = reader.readAll();
            for (String[] line : csvEntries) {
                for (int lineCount = 0; lineCount < line.length; lineCount++) {
                    line[lineCount] = line[lineCount].trim();
                }
            }
            lineArray = new String[csvEntries.size() - 1][];
            for (int i = 1; i < csvEntries.size(); i++) {
                lineArray[i - 1] = csvEntries.get(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineArray;
    }
}