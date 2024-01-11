package class8;

import java.util.Scanner;

public class E5ScannerandArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Pleasse enter a number "+(i+1));
            numbers[i] = sc.nextInt();

        }
        System.out.println("Here are all the numbers that you enters");

            for(int i =0 ; i<numbers.length;i++) {
                System.out.println(numbers[i] + " ");
            }


    }

    }



