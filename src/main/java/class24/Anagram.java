package class24;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1= "silent";
        String s2="listen";
        if(s1.length() ==s2.length()){
            char[] ch1= s1.toCharArray();
            char[] ch2 =s2.toCharArray();


            Arrays.sort(ch1);
            Arrays.sort(ch2);

            System.out.println(Arrays.toString(ch1));
            System.out.println(Arrays.toString(ch2));






        }
    }
}
