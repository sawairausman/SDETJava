package class26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;
import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class HW {
    public static void main(String[] args) throws IOException {

        String path ="C:\\Users\\ozyno\\IdeaProjects\\SDETJavaB18a\\Files\\hrmsPersonalDetailsxlsx.xlsx";
        String sheetName="Sheet1";
        List<Map<String,String>> testData= ExcelReader.read(path,sheetName);
        testData.forEach(x->{
            System.out.println(x);
        });

        String url= ConfigReader.read("url");
        String userName=ConfigReader.read("userName");
        String password=ConfigReader.read("password");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement userNameWE=driver.findElement(By.xpath("//input[@id='txtUsername']"));

        WebElement passwordWE=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        userNameWE.sendKeys(userName);
        passwordWE.sendKeys(password);
        WebElement enterBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        enterBtn.click();


        testData.forEach(x->{

            driver.findElement(By.xpath("//a/b[text()='PIM']")).click();
            driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
            driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(x.get("FirstName"));
            driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(x.get("LastName"));
            driver.findElement(By.xpath("//input[@id='btnSave']")).click();
            driver.findElement(By.xpath("//input[@value='Edit']")).click();
           WebElement fN= driver.findElement(By.xpath("//input[@title='First Name']"));
           fN.clear();
           fN.sendKeys(x.get("FirstName"));
            WebElement LN= driver.findElement(By.xpath("//input[@title='Last Name']"));
            LN.clear();
            LN.sendKeys(x.get("LastName"));
           WebElement EmpiD= driver.findElement(By.xpath("//input[@name='personal[txtEmployeeId]']"));
           EmpiD.clear();
           EmpiD.sendKeys(x.get("EmployeeId"));
           WebElement EmpotheriD= driver.findElement(By.xpath("//input[@name='personal[txtEmployeeId]']"));














        });










    }

}
