import java.util.Arrays;

public class PracticeMock5 {

public static void checkAnagrams(String a, String b){
    if(a.length()!=b.length()){
        System.out.println("they can't be anagram ");
    }

    for (int i = 0; i < a.length(); i++) {
        boolean foundMatch = false;
        for (int j = 0; j < b.length(); j++) {
            if(a.charAt(i)==b.charAt(j)){
                foundMatch= true;
                break;
            }

        }if(!foundMatch){
            System.out.println("String are not anagram");
            break;
        }

    }
    System.out.println("Strings are anagram");
}

    public static void main(String[] args) {
        checkAnagrams("silebt","listeb");

        String a= "silent";
        String b ="listen";

        char [] a1 = a.toCharArray();
        char [] b1= b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        if(Arrays.equals(a1,b1)){
            System.out.println("Strings is anagram");
        }else{
            System.out.println("String are not anagram");
        }
    }
}


