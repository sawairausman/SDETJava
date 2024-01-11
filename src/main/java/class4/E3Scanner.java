package class4;

import java.util.Scanner;

public class E3Scanner {

    public static void main(String[] args) {
        System.out.println("Please Enter your age");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        System.out.println("You are "+age+" years old");
    }
}
