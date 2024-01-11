package replit;

import java.util.Scanner;

public class repl104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     String [] a = new String[5];

        System.out.println("Please enter names");
        for (int i = 0; i < a.length; i++) {
            a[i] =sc.nextLine();
            if (a[i].length() >= 3) {

                String subinput = a[i].substring(0,3);
                System.out.println(subinput);
            }
            else{
                System.out.println("Name is too short");
            }
            }

        }


        }



