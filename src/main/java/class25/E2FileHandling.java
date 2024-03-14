package class25;

import utils.ConfigReader;

import java.io.IOException;

public class E2FileHandling {

    public static void main(String[] args) throws IOException {
       String value=  ConfigReader.read("userName");
        System.out.println(value);
    }
}

//we have a method under the file ConfigReader this method goes inside the file ConfigReader and
//it brings the values of these keys from the file. or reads the data from the file
//we need to use the method and as a parameter we pass the name of the key.
//read method will get the value of that key.