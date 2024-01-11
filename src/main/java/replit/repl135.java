package replit;

public class repl135 {


    public static String surround(String s, String search_term) {

        //int index = s.indexOf(search_term);
//        String first = s.substring(0,index);
//        String last = s.substring(index+ search_term.length());
//        return  first +"("+ search_term+")"+last;

         String s1 = s.replaceAll(search_term,"(" + search_term + ")");
         return s1;
    }



    public static void main(String[] args) {

        System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
        System.out.println(surround("technology","o")); //"techn(o)l(o)gy"

    }

        }


