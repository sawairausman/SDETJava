package class12;

public class Palindrome {
    public static void main(String[] args) {

        String str ="madam";




       String reverse = "";

            for (int i = str.length()-1; i>=0 ; i--) {
                reverse = reverse + str.charAt(i);

            }

                if(str.equalsIgnoreCase(reverse)){
                    System.out.println("It is Palindrome");

                }else {
                    System.out.println("It is not Palindrom");
                }

            }
        }







