package MyOwnCode;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {

        int a, b, count = 0;

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer ");
        a = sc.nextInt();

        for (b = 1; b <= a;  b ++)
        {
            if ( a % b == 0)
            {
                count++;
            }
        }
        if (count == 2)
        {
            System.out.println("prime number");
        }
        else
        {
            System.out.println("not prime number");
        }
    }
}
