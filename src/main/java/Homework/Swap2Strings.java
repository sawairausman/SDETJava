package Homework;

public class Swap2Strings {
    // Swap 2 strings without a temporary variable?

    public void SwapString(String str1, String str2){
        System.out.println("Original String : "+ str1+" "+ str2);

        str1 = str1+str2;
        str2= str1.substring(0, str1.length()- str2.length());
        str1= str1.substring(str2.length());
        System.out.println("Swapped String  : " +str1+ " "+str2 );

    }

    public static void main(String[] args) {
        new Swap2Strings().SwapString("Sub","Zero");
    }
}
