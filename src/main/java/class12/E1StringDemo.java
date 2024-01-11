package class12;

public class E1StringDemo {
    public static void main(String[] args) {
        String str="Its Savera's Birthday today. Its Sunday. Today is Java Class";

        // split method returns array of strings
        String [] strArr= str.split("[.]");
        System.out.println(strArr.length);
        System.out.println(strArr[2].trim());


        String [] wordArr= str.split(" ");
        System.out.println(strArr.length);
        System.out.println(wordArr[0]);
    }
}
