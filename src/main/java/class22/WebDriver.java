package class22;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void findElement();
    void maximizeWindow();


}

class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open Browser in Chrome Driver");

    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Browser in Chrome Driver");

    }

    @Override
    public void findElement() {
        System.out.println("Find elements in Chrome Driver");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximiize window in Chrome Driver");

    }
}

class FireFoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open Browser in FireFox Driver");


    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Browser in FireFox Driver");


    }

    @Override
    public void findElement() {
        System.out.println("Find elements in FireFox Driver");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximiize window in FireFox Driver");


    }
}
