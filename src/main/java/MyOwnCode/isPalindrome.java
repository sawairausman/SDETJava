package MyOwnCode;

public class isPalindrome {
    public static void main(String[] args) {
        String str ="race car";
        String newstr= str.replace(" ","").toLowerCase();
        String revStr = "";

        for (int i = newstr.length()-1; i >=0 ; i--) {
            revStr += newstr.charAt(i);
        }if(newstr.equals(revStr)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrom");
        }

    }
}
