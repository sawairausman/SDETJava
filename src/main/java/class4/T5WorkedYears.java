package class4;

import java.util.Scanner;

public class T5WorkedYears {
    public static void main(String[] args) {
        //Write a program to ask user to enter numbers of worked years and annual salary.
// If user worked for more or equals to 5 years than user is eligible for the bonus,
// otherwise he is not.
// Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise
// bonus=3000.


        Scanner sc = new Scanner(System.in);

        System.out.println("How many years of work experience ? ");
        double workYears = sc.nextDouble();



        if(workYears>=5){
            System.out.println("You're eligible for bonus ");

            System.out.println("Enter your salary ");
            double salary = sc.nextDouble();
            if(salary>50000){
                System.out.println("You get a $5000 bonus");
            }else {
                System.out.println("You get a $3000 bonus");
            }
        }else {
            System.out.println("You're not eligible for bonus ");
        }



    }
}
