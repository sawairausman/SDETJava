package class4;

import java.util.Scanner;

public class ProbleminScanner {
    public static void main(String[] args) {

        //why we need to clear the buffer memory
//
//        System.out.println("Please Enter your age");
//        Scanner sc=new Scanner(System.in);
//        int age=  sc.nextInt();
//        System.out.println("Please Enter your full name");
//        sc.nextLine();
//        String fullName=sc.nextLine();
//        System.out.println("Your name is "+fullName+" and you are "+age+" old");
//    }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = sc.nextLine();
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        System.out.println("Enter your mobile number ");
        sc.nextLine();
        String number = sc.nextLine();


        System.out.println("Your name is " + name + ", " + "your age is " + age + " and your mobile number is " + number);

    }
}


