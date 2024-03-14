package class25;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1FileHandling {
    public static void main(String[] args) throws IOException {
        //Dealing with files reading/writing/copying/moving files using programming
        //1.
        //A variable to hold the location of the file.
        String path="C:\\Users\\ozyno\\IdeaProjects\\SDETJavaB18a\\Files\\Config.properties";
//Navigate to this location //use a class to navigate to that file to the RAM
        FileInputStream fis= new FileInputStream(path);
        //A software/class that knows how to read/write data to that file
        //this is special class that knows how to read/write data from .properties file

        Properties properties= new Properties();
//load method is going to load path into the properties obj

        properties.load(fis);
        System.out.println(properties.getProperty("userName"));

    }
}
