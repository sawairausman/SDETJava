package class19;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E4Poly {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        chromeDriver.navigate().to("https://instagram.com");
        chromeDriver.navigate().back();
        Thread.sleep(2000);
        chromeDriver.close();

       FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        firefoxDriver.navigate().to("https://instagram.com");
        firefoxDriver.navigate().back();
        Thread.sleep(2000);
        firefoxDriver.close();

//        EdgeDriver edgeDriver = new EdgeDriver();
//        edgeDriver.navigate().to("https://amazon.com");
//        Thread.sleep(2000);
//        edgeDriver.navigate().to("https://instagram.com");
//        edgeDriver.navigate().back();
//        Thread.sleep(2000);
//        edgeDriver.close();
    }
}
