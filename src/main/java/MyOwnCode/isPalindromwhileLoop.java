package MyOwnCode;

public class isPalindromwhileLoop {
    public static void main(String[] args) {
        String str = "madame";
        int left =0;
        int right = str.length()-1;

        while(left<right){
            if(str.charAt(left)==str.charAt(right)){
                left++;
                right--;
            }else{
                System.out.println("Not palindrome");
                break;
            }

            System.out.println("is Palindrome");

            }




        }
    }

