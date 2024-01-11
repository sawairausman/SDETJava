package class19;

import org.openqa.selenium.chrome.ChromeDriver;

public class E3Poly {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver chromeDriver = new ChromeDriver();//opening the browser
        chromeDriver.get("https//amazon.com");// get the url
        Thread.sleep(2000);//java go to sleep for 2sec pause the execution for
        System.out.println(chromeDriver.getTitle());//get the title
        chromeDriver.close();


//        EdgeDriver edgeDriver = new EdgeDriver();
//        edgeDriver.get("https://amazon.com");
//        edgeDriver.close();

    }
}
