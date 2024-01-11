package class5;

import java.util.Scanner;

public class T3CalculatorIfElse {
    public static void main(String[] args) {

        //  Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
//        Based on operator provide the result to user.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers : ");
        double a = sc.nextInt();
        double b = sc.nextInt();
        System.out.print("Enter the operator +, -, /, * ");
        char op = sc.next().charAt(0);
        double c =0;

        if(op=='+'){
            c = a+b;
        }else if(op=='-'){
            c=a-b;
        }else if(op=='*'){
            c=a*b;
        }else if(op=='/'){
            if(b!=0){
                c=a/b;
            }else{
                System.out.println("Division by 0 is not allowed");
                return;
            }
        }else{
            System.out.println("Invalid operator");
        }
        System.out.println("Result "+ c);
    }
}
