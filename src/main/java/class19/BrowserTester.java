package class19;

public class BrowserTester {
    public static void main(String[] args) {

        //static approach
        Chrome chrome=new Chrome();
        chrome.get("https://Amazon.com");
        chrome.performTest();
        chrome.closBrowser();

//        FireFox fireFox=new FireFox();
//        fireFox.get("https://Amazon.com");
//        fireFox.performTest();
//        fireFox.closBrowser();

        Safari safari=new Safari();
        safari.get("https://Amazon.com");
        safari.performTest();
        safari.closBrowser();

        Edge edge=new Edge();
        edge.get("https://Amazon.com");
        edge.performTest();
        edge.closBrowser();

        System.out.println("***************************");
        //A loop that picks all the objects one by one from array
        //and places it inside the b variable.

        Browser [] bArrr={new Chrome(), new Safari(), new Edge() };
        Browser[] bArr={chrome,safari,edge};

        for (int i = 0; i <bArr.length ; i++) {

            Browser b=bArr[i];
            b.get("https://Amazon.com");
            b.performTest();
            b.closBrowser();
        }



    }
    }

