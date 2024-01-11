package replit;

import java.util.Scanner;

public class reversethearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 values in a array");
       int [] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            int n= sc.nextInt();
            array[i]+=n;

        }

        for (int i = array.length-1; i >=0 ; i--) {
            System.out.print(array[i]+" ");

        }
    }
}
