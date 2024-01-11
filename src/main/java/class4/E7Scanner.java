package class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your gender m/f");
        char gender = scanner.next().charAt(0);
        System.out.println("Your gender is "+gender);
    }
}
