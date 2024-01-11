package replit;

import java.util.Scanner;

public class Rep77 {
    public static void main(String[] args) {
        //reverse the array
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [5];
        for(int i = 0; i<arr.length;i++) {

            int n = sc.nextInt();
            arr[i]+= n;
        }
        for(int j=arr.length-1; j>=0;j--){
            System.out.println(arr[j]+ " , ");
        }
    }
}
