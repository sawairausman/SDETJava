package class25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;

import java.io.IOException;

public class E1Selenium {
    //if you dont use files
    public static void main(String[] args) throws IOException {
        //String url ="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard"
        //String userName="Admin"
        //String password="Hum@nhrm123"
        //everywhere we use this method to store sensitive information for security purpose
        String url = ConfigReader.read("url");
        String userName = ConfigReader.read("userName");
        String password = ConfigReader.read("password");

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(url);
        webDriver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(userName);
        webDriver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
        webDriver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        webDriver.close();


    }
}
