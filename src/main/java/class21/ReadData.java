package class21;

public class ReadData {

    public static void main(String[] args) {
        ExcelFile excelFile = new ExcelFile();

        excelFile.read();
        TxtFile txtFile =new TxtFile();
        txtFile.read();
    }
}
