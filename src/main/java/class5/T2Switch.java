package class5;

import java.util.Scanner;

public class T2Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 distict numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int larg =0;

        if(num1>num2){
            if(num1>num3){
                larg = num1;

            }
        }else if(num2>num3){
            larg = num2;
        }else{
            larg =num3;
        }
        System.out.println("The largest number is "+larg);
        }
    }



