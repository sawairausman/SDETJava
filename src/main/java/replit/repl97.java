package replit;

import java.util.Scanner;

public class repl97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String browser = sc.nextLine();
        String b =browser.toLowerCase();
        if(b.equals("chrome")){
            System.out.println("Proceed with "+b.substring(0,1).toUpperCase()+b.substring(1,b.length())+ " browser");
        }
        else if(b.equals("firefox")){
            System.out.println("Proceed with "+b.substring(0,1).toUpperCase()+b.substring(1,b.length())+ " browser");
        }else if(b.equals("ie")){
            System.out.println("Proceed with "+b.substring(0,b.length()).toUpperCase()+ " browser");
        }else {
            System.out.println("Invalid" +b.substring(0,1).toUpperCase()+b.substring(1,b.length())+ " browser");
        }

    }



}
