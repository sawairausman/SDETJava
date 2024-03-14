package class21;

public abstract class File {

    private String name;
    private int size;
    public abstract void Open();

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void edit(){
        System.out.println(name+ " with size "+size+" is editing");
    }
    public void close(){
        System.out.println(name+ " with size " +size+" is closing");
    }


    public void createNewFile() {
    }
}

class JavaFile extends File{
    public JavaFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void Open() {
        System.out.println("you need notepad++ to open .java file");
    }
}

class WordFile extends File{

    public WordFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void Open() {
        System.out.println("you need .doc Microsoft to open Wordfile ");
    }
}
class PdfFile extends File{
    public PdfFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void Open() {
        System.out.println("you need PDF .pdf to open the PDFfile");
    }
}

