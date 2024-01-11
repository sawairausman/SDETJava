package class4;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        System.out.println("Please Enter your name");

        Scanner fetch = new Scanner(System.in);
        String name = fetch.next();

        System.out.println("Your name is " +name);
    }
}
