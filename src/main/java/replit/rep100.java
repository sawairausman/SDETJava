package replit;

import java.util.Scanner;
 /*
         Given the following inputs:
String s;
Write a for loop that will print out the reverse of the string.
Sample input/outputs:
In: manhattan
nattahnam
```*/


public class rep100 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s= sc.nextLine();
        String rev="";
        for (int i = s.length()-1; i >=0 ; i--) {
            rev+=s.charAt(i);

        }
        System.out.println(rev);
        System.out.println("Enter a string: ");
        String a= sc.nextLine();

        for (int i = 0; i < a.length(); i+=2) {
            System.out.print(a.charAt(i)+" ");


        }
    }


}
