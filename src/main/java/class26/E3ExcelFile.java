package class26;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E3ExcelFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream(Constants.EXCEL_FILE_PATH);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fis);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
//        Row row=sheet.getRow(2);
//        Cell cell=row.getCell(1);
//        System.out.println(cell);
        int noOfActualRowswithData = sheet.getPhysicalNumberOfRows();
        //List will keep map

        List<Map<String, String>> excelData = new ArrayList<>();

        //extracting the header row we will be putting it outside so we not
        //repeating this step again again
        Row headerRow = sheet.getRow(0);
//header is 0 thats why we starting it from 1
        for (int i = 1; i < noOfActualRowswithData ; i++) {
            //get physical number of all rows
            Row row = sheet.getRow(i);
            //for every row we need a map
            Map<String,String> rowMap = new LinkedHashMap<>();
            //for the m ap we need keys and values keys are presnent in row0
            //and reusing the keys

            //we have to get gphysical number os actual cells

            int noOfActualCellsWithData = row.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfActualCellsWithData; j++) {
                //fill the map for each row //,map is compelte we need to put it in
                //list

                //extract keys one by one the info from the header to string method
                //to convert  headerRow.getCell(0) returns obj  of cell class to string

                String key = headerRow.getCell(j).toString();
                String value= row.getCell(j).toString();
                //store it inside a  map

                rowMap.put(key,value);



            }

            excelData.add(rowMap);


        }

    }
}
