package class25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;
import utils.Constants;

import java.io.IOException;

public class HW {
    public static void main(String[] args) throws IOException {
       /* FileInputStream fis = new FileInputStream("C:\\Users\\ozyno\\IdeaProjects\\SDETJavaB18a\\Files\\fb.properties");
        Properties properties = new Properties();
        properties.load(fis);
        //read values from the fb.properties
        System.out.println(properties.getProperty("userName"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("browser"));*/
        String url= ConfigReader.read("url", Constants.FB_FIlE_PATH);
        String userName= ConfigReader.read("userName", Constants.FB_FIlE_PATH);
        String password= ConfigReader.read("password", Constants.FB_FIlE_PATH);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
        //driver.findElement(By.xpath("//button[@id='loginbutton']")).click();

    }
}
