package class25;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExcelFile {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\ozyno\\IdeaProjects\\SDETJavaB18a\\Files\\Batch18.xlsx";
        //Class that brings the data in the form of bytes into the memory
        FileInputStream fis= new FileInputStream(path);

        //special class that handle the excel file
        XSSFWorkbook excel = new XSSFWorkbook(fis);
        //excel files has files and inside those sheets we have rows and coloum first
        //go and excess the sheet from that file

        Sheet sheet= excel.getSheet("Sheet1");
        //two D arrays in excel we have to access rows and then access the columns
//indexes start from 0
        Row row0 = sheet.getRow(1);//entire is accessed only want lastName
        Cell cell1= row0.getCell(1);
        System.out.println(cell1);//dont worry about the error


    }
}
