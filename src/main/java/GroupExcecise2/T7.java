package GroupExcecise2;

public class T7 {


    public static int numofWords(String str){
        int count =0;

        String [] newstr = str.split(" ");

        for (int i = 0; i <newstr.length ; i++) {
            count++;

        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(numofWords("Hello, world! How are you"));

    }
}
