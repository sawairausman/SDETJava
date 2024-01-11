package MyOwnCode;

import java.util.ArrayList;

public class SplitStringwhenCharRepeats {

    public static String[] split_string(String str) {

        String res ="";
        for(int i=0; i<str.length(); i++) {

            if(i==str.length()-1) {
                res = res+str.charAt(i);
                break;
            }
            if(str.charAt(i) != str.charAt(i+1)) {
                res = res+str.charAt(i)+" ";
            }
            else {
                res = res+str.charAt(i);
            }
        }
        System.out.println(res);
        return res.split(" ");
    }

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();
        String[] word_arr = split_string("aHHHbYY");
        for(String wrd : word_arr) {
            words.add(wrd);
        }

        System.out.println(words);
    }
}

