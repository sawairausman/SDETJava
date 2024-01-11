package MyOwnCode;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";


            for (int i = 0; i < str1.length(); i++) {
                boolean foundMatch = false;

                for (int j = 0; j < str2.length() ; j++) {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        foundMatch = true;
                        break;
                    }
                }
                if (!foundMatch) {
                    System.out.println("String is not anagram");
                    break;

                }
        }
        System.out.println("Strings are anagram");
        }
    }




