package MyOwnCode;

public class CountNumOfWords {
    public static void main(String[] args) {
        String str ="Hello, world!";
        int count=0;

        String [] newStr = str.split("[ \\s ]");
        for (int i = 0; i < newStr.length; i++) {
            count++;

        }
        System.out.println(count);
    }
}
