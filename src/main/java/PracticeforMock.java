public class PracticeforMock {

    public static void swap2Strings(String a, String b){
        System.out.println(a+" "+b);
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println(a+" "+b);
    }


    public static void swap2Stringss(String a, String b){
        System.out.println(a+" "+b);
        a=a+b;
        b= a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println(a+" "+b);
    }

    public static void findAlplha(String s){
        String a= s.replaceAll("[^A-Za-z0-9]","");
        System.out.println(a.length());
    }

    public static void revereString(String s) {
        String rev="";
        for (int i = s.length()-1; i >=0 ; i--) {
             rev+= s.charAt(i);

        }
        System.out.println(rev);
    }

    public static void isPalindrome(String s ){
        String rev="";
        String a =s.replaceAll(" ","").toLowerCase();
        if(s.isEmpty()){
            System.out.println("invalid string");
        }
        if(a.length()>=2) {

            for (int i = a.length() - 1; i >= 0; i--) {
                rev += a.charAt(i);

            }
            if (rev.equals(a)) {
                System.out.println("the string is palindrome ");
            } else {
                System.out.println("the string is not palindrome");
            }
        }

    }
    public static void transposeArray(int [][] array){
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j][i]+" ");

            }
            System.out.println();

        }
    }

    public static void reverseStringBuilder(){
        StringBuilder s1= new StringBuilder("Hello");
        s1.reverse();
        System.out.println(s1);
    }

    public static void countVowels(String s){
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a'|| s.charAt(i)=='e'||
               s.charAt(i)=='i'|| s.charAt(i)=='o'||
                    s.charAt(i)=='u'){
                count++;
            }
        }   System.out.println(count);
    }

    public static void countWords(String s){
        String [] a =s.split(" ");
        int count =0;
        for (int i = 0; i < a.length; i++) {
            count++;

        }
        System.out.println(count);
    }
    public static void countVowelsUsingRegex(String x){
        System.out.println(x.replaceAll("[^aeiouAEIOU]","").length());
    }
    public static void main(String[] args) {
        swap2Strings("sub", "zero");
        swap2Stringss("pepsi","cola");

        findAlplha("hfkshkEDFSGd#$$^e4546fgdf");
        revereString("Hello");
        isPalindrome("race car");

        int[][] array = {{1, 2, 3, 5}, {4, 5, 6,7}};
        transposeArray(array);

        reverseStringBuilder();

        countVowels("documentation");
        countVowelsUsingRegex("documentation");
        countWords("Hello, world! i am learning java");
    }



}
