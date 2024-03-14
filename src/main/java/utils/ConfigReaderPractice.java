package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReaderPractice {

    public static String read(String key, String path)  {
        Properties p = new Properties();
        try(FileInputStream fis = new FileInputStream(path)) {


            p.load(fis);
        }
        catch(IOException ioException){
            ioException.printStackTrace();
        }
        return p.getProperty(key);
    }

    public static String read(String key){
        return read(key, Constants.CONFIG_FILE_PATH);
    }
}
