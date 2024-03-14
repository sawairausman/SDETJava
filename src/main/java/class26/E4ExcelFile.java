package class26;

import utils.Constants;
import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class E4ExcelFile {
    public static void main(String[] args) throws IOException {
        //ExcelReader.read(Constants.EXCEL_FILE_PATH,"Sheet1");

        List<Map<String, String>> data = ExcelReader.read(Constants.EXCEL_FILE_PATH, "Sheet1");
        //first row extracted
        data.get(0);//complete map
        System.out.println(data.get(0));

        //individual vlaues from map get method and pass key
        System.out.println(data.get(3).get("FirstName"));

        data.forEach(x -> System.out.println(x));
        //can be written this way too
        data.forEach(System.out::println);
    }
}
