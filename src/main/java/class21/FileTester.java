package class21;

public class FileTester {
    public static void main(String[] args) {

        File [] file = {new JavaFile("java file",120),
                        new PdfFile("pdf file",130),
                        new WordFile("word file", 100)
        };

        for (File f:file) {
            f.Open();
            f.edit();
            f.close();
            System.out.println("***************");


        }

    }
}
