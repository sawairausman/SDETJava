package LeetcodePractice;

public class palindromeInt {
    public static void main(String[] args) {


        int num= 11211;
        int result =0;
        int q= num;


      while(q!=0) {

            int remainder = q % 10;
            result = result * 10 + remainder;
            q = q / 10;
        }

        if(result==num) {
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }

        String nnum= Integer.toString(num);
        String rev="";
        for (int i = nnum.length()-1; i >=0; i--) {
            rev = rev+ nnum.charAt(i);

        }
        if(nnum.equals(rev)){
            System.out.println("ispalindrome");
        }


    }
}
