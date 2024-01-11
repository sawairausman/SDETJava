package LeetcodePractice;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");

      String num = sc.nextLine();

      String num1 = num.replace(" ", "");
        int left= 0;
        int right =num1.length()-1;
      while(left<right){
          if(num1.charAt(left)==num1.charAt(right)){
              left++;
              right--;

          }

          else{
              System.out.println("not apalindrome");
              break;
          }
      }
        System.out.println("palindrome");

    }
    }

