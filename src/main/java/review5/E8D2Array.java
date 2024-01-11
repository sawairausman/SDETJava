package review5;

import java.util.Arrays;
import java.util.Scanner;

public class E8D2Array {
    public static void main(String[] args) {

// scanner to store size of the array
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the size of the Array");
        int size = sc.nextInt();
       // int col = sc.nextInt();

        int [] numbers = new int[size];
        System.out.println(numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter the number "+(i+1));
            numbers[i]= sc.nextInt();

        }
        System.out.println(Arrays.toString(numbers));
        //System.out.println(numbers[0].length);// rows
    }
}
