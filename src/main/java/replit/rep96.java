package replit;

import java.util.Scanner;

public class rep96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any programming language");
        String language = sc.nextLine();
        if (language.equalsIgnoreCase("Java")) {
            System.out.println(language.concat("is a programming language"));
        }
    }
}
