package class22;

public class WebDriverTester {
    public static void main(String[] args) {

        WebDriver [] wb ={new ChromeDriver(), new FireFoxDriver()};
        for(WebDriver webDriver:wb){
            webDriver.openBrowser();
            webDriver.closeBrowser();
            webDriver.maximizeWindow();
            webDriver.findElement();
            System.out.println("--------------------------------");

        }
    }
}
