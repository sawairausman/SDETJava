package class26;

import utils.Constants;
import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class E5Excelfile {
    public static void main(String[] args) throws IOException {
        List<Map<String,String>> data=ExcelReader.read(Constants.EXCEL_FILE_PATH, "Sheet1");

      data.forEach(x->x.forEach((k,v)->{
          System.out.println(k+" "+v);

      }));

        data.forEach((k)-> System.out.println(k.entrySet()));

        //lamda can automatically go in class n take parameter
    }
}
