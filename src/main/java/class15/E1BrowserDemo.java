package class15;

import org.openqa.selenium.chrome.ChromeDriver;

public class E1BrowserDemo {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.navigate().to("https://amazon.com");
        chromeDriver.close();
    }
}
