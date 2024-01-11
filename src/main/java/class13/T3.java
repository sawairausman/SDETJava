package class13;

public class T3 {

    void isPalindrome(String name){
        String reverse ="";
        for(int i =name.length()-1; i>=0;i--){
            reverse+=name.charAt(i);

        }
        if(name.equals(reverse)){
            System.out.println(name + " is a palindrome");
        }else{
            System.out.println(name +" is not palindrome");
        }
    }

    public static void main(String[] args) {
        T3 n = new T3();
        n.isPalindrome("madam");
        n.isPalindrome("dfasdfs");
    }
}
