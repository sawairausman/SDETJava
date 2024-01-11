package class4;

import java.util.Scanner;

public class T1ScanLoan {

    public static void main(String[] args) {

        // You are a loan specialist and
        // you need to ask user what is the amount of loan is needed.
        // if loan is less or equal to 200,000 then you would lend the money
        // otherwise you would reject the clien

        Scanner sc = new Scanner(System.in);
        System.out.println("What is the amount of Loan is needed? ");

        Double loan = sc.nextDouble();

        if(loan <= 200000){
            System.out.println("You will be approved for loan");
        }else{
            System.out.println("You will be rejected for the loan");
        }

    }
}
