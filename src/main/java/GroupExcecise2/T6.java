package GroupExcecise2;

public class T6 {
    //Create a method to count how many vowels are present in a string
    //“documentation

    public static int CheckVowels(String string){
        int count =0;
        string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i)=='a'||string.charAt(i)=='e'||
               string.charAt(i)=='i'||string.charAt(i)=='o'||
               string.charAt(i)=='u'){
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println( CheckVowels("documentation"));

        String s = "documentation";

        System.out.println(s.replaceAll("[^aeiouAEIOU]","").length());
    }

}
