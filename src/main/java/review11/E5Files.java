package review11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E5Files {
    public static void main(String[] args) throws IOException {
        String path ="C:\\Users\\ozyno\\IdeaProjects\\SDETJavaB18a\\Files\\Config.properties";
        //Bringing the file to the Memory(RAM)
        FileInputStream nato=new FileInputStream(path);

        Properties properties=new Properties();
        properties.load(nato);
        System.out.println(properties.getProperty("url"));

    }
}
