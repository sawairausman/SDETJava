package MyOwnCode;

public class RevereAString {
    public static void main(String[] args) {
        String str ="Hello";
        for (int i = str.length()-1; i>=0; i--) {
            String newStr= "";
            newStr+= str.charAt(i);

            System.out.print(newStr+"");

        }

    }
}
