package GroupExcecise2;

public class T3 {
//    Reverse a String: Write a function to reverse a given string. For example,
//

    public static String reverseString(String string){
        String reverseStr="";
        for (int i = string.length()-1; i >=0 ; i--) {
        reverseStr+= string.charAt(i);

        }
        return reverseStr;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));


    }
}
