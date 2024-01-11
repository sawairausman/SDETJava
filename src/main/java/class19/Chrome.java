package class19;

class Browser{
    void get(String url){
        System.out.println("Loading.."+url+"in Broser");
    }

    void performTest(){
        System.out.println("Checking if website is working properly in browser");
    }

    void closBrowser(){
        System.out.println("Closing theBrowser");
    }

}

public class Chrome extends Browser {
    void get(String url){
        System.out.println("Loading.."+url);
    }

    void performTest(){
        System.out.println("Checking if website is working properly in chrome");
    }

    void closBrowser(){
        System.out.println("Closing the Google Chrome Browser");
    }

}

class Edge extends Browser {
    void get(String url){
        System.out.println("Loading.."+url);
    }

    void performTest(){
        System.out.println("Checking if website is working properly in Edge");
    }

    void closBrowser(){
        System.out.println("Closing the Google edge Browser");
    }

}

class Safari extends Browser{
    void get(String url){
        System.out.println("Loading.."+url);
    }

    void performTest(){
        System.out.println("Checking if website is working properly in safari");
    }

    void closBrowser(){
        System.out.println("Closing the Google safari Browser");
    }

}
