package class5;

import java.util.Scanner;

public class T3LogicalOperator {
    public static void main(String[] args) {

//        Ask user to enter a number and then categorize if number is small, medium or large
//        Small number is value between 1 and 10 Medium number is value
//        between 11 and 100
//        Large number is value between 101 and 1000
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = sc.nextInt();
        if(num>=1 && num<=10){
            System.out.println("Small Number ");

        }else if (num>=11 && num<=100){
            System.out.println("Medium Number");
        }else if(num>=101 && num<=1000){
            System.out.println("Large Number");
        }else{
            System.out.println("Very Large Number");
        }
    }
}
