package Testng;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVFile {

    public static Object[][] getCSVData(String csvFilePath) throws Exception {
        List<Object[]> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Skip empty lines
                if (line.trim().isEmpty()) {
                    continue;
                }
                String[] values = line.split(",");
                // Ensure exactly two values
                if (values.length == 2) {
                    data.add(new Object[]{values[0].trim(), values[1].trim()});
                } else {
                    System.out.println("Skipping invalid line: " + line);
                }
            }
        }
        return data.toArray(new Object[0][]);
    }
}