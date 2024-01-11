package class5;


import java.util.Scanner;

public class T4LogicalOperator {
    public static void main(String[] args) {
//        Write a program that will ask user to  inputs
//        the current time (use 24 hour format).
//                Based on the given time define:
//        if hour is between 1-11 --> Morning
//        if hour between 12-15 --> Afternoon
//        if hour between 16-20 --> Evening
//        if hour between 21-24 --> Night
//        If anything else print invalid
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Current time in 24 Hour format: ");

        double time = sc.nextDouble();
        if(time>=1 && time<=11){
            System.out.println("Morning");
        }else if(time>=2 && time<=15){
            System.out.println("Afternoon");
        }else if(time>=16 && time<=20){
            System.out.println("Evening");
        }else if(time>=21 && time<=24){
            System.out.println("Night");
        }else
        {
            System.out.println("Invalid time");
        }
    }





}
