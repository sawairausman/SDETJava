package class11;

public class T4 {
    public static void main(String[] args) {
        String str = "Sunday";
        String reverse ="";

        for (int i = str.length()-1; i >=0; i--) {

            reverse += str.charAt(i);

        }
        System.out.println(reverse);
    }
}
