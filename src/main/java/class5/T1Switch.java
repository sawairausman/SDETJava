package class5;

import java.util.Scanner;

public class T1Switch {
    public static void main(String[] args) {

//        Ask user to enter their country and capture it. Once values are captured
//        print which language user speaks. Just do this for any 5 countries
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your country");
        String lang;
        String con = sc.next();

        switch(con.toLowerCase()){
            case "us":
                lang ="English and Spanish";
                break;
            case "germany":
                lang ="German";
                break;
            case "spain":
                lang ="Spanish";
                break;
            case "pakistan":
                lang ="Urdu";
                break;
            case "mexico":
                lang ="Spanish";
                break;
            default:
                lang = "Invalid";

        }
        System.out.println("You Speak " +lang);
    }
}
