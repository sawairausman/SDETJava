package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    //generic method code that will help us read data from the file

//    public static String read(String key, String path) throws IOException {
//        FileInputStream fis= new FileInputStream(path);
//        //properties class that understand how file works
//        Properties properties = new Properties();
//        properties.load(fis);
//        //name of key will be used to must return String
//       return properties.getProperty(key);
//
//
//    }

    public static String read(String key, String path) {

        Properties  properties = new Properties();
        try (FileInputStream fis = new FileInputStream(path))
        {
            properties.load(fis);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return properties.getProperty(key);

    }


    public static String read(String key) throws IOException {
        return read(key,Constants.CONFIG_FILE_PATH);
    }
}
