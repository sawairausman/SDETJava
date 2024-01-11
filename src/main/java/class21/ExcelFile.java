package class21;

interface FileReader{
    void read();
}
public class ExcelFile implements FileReader {


    public void read(){
        System.out.println("Reading an excel file");
    }

}

class TxtFile implements FileReader{

    @Override
    public void read() {
        System.out.println("reading Text file");
    }
}
