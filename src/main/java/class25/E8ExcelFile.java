package class25;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E8ExcelFile {
    public static void main(String[] args) throws IOException {

        //we first create the list then create the maps then add values into maps then store maps them into our list

        String path ="C:\\Users\\ozyno\\IdeaProjects\\SDETJavaB18a\\Files\\Batch18.xlsx";
        FileInputStream fis= new FileInputStream(path);
        XSSFWorkbook excel = new XSSFWorkbook(fis);
        Sheet sheet= excel.getSheet("Sheet1");
        List<Map<String, String>> excelData = new ArrayList<>();
        int noOfRows = sheet.getPhysicalNumberOfRows();

//extract the first header row
        Row header = sheet.getRow(0);

        //starting with row1
        for (int i = 1; i < noOfRows; i++) {

            Row row = sheet.getRow(i);
            //create new map no of cells storing in a array list no confusion of duplicate keys
            Map<String, String> rowData = new LinkedHashMap<>();
            int noOfCol = row.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfCol; j++) {
                //got the first coloumn
                String key = header.getCell(j).toString();
                // got the first name
                String value = row.getCell(j).toString();
                //putting info in the map
                rowData.put(key, value);
            }
            excelData.add(rowData);
        }
        System.out.println(excelData);
    }
    }

